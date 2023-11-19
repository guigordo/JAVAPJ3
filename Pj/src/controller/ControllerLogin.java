
package controller;

import DAO.ClientesDAO;
import DAO.Conexao;
import model.Clientes.Cliente;
import view.LoginFrame;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import view.ClienteOpcFrame;

public class ControllerLogin {
    
    private LoginFrame view;
    public static Cliente clientelogado;
    
    public ControllerLogin(LoginFrame view){
        this.view = view;
    }
    
    public void loginCliente(){
        Cliente cliente = new Cliente(view.getTxtcpf().getText(),view.getTxtsenha().getText(),null,null,null);
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            ClientesDAO dao = new ClientesDAO(conn);
            ResultSet res = dao.consultar(cliente);
            if(res.next()){
                JOptionPane.showMessageDialog(view, "Login Feito", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                String cpf = res.getString("cpf");
                String senha = res.getString("senha");
                String tdc = res.getString("tdc");
                String saldo = res.getString("saldo");
                String nome = res.getString("nome");
                
                clientelogado = new Cliente(cpf,senha,tdc,saldo,nome);
                ClienteOpcFrame viewCpc = new ClienteOpcFrame(new Cliente(cpf,senha,tdc,saldo,nome));
                viewCpc.setVisible(true);
                view.setVisible(false);
            } else{
                JOptionPane.showMessageDialog(view, "Login não Efetuado", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        
        }catch(SQLException e){
            JOptionPane.showMessageDialog(view, "Erro de conexão" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    public static Cliente getclientelogado(){
        return clientelogado;
    }
}
