
package controller;

import DAO.Conexao;
import DAO.GerenteDAO;
import model.Gerente;
import view.CadastroFrame;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;



   public class ControllerCadastro {
    
    private CadastroFrame view;

    public ControllerCadastro(CadastroFrame view) {
        this.view = view;
    }
    
    public void salvarCliente(){
        String nome = view.getTxtnome().getText();
        String CPF = view.getTxtcpf().getText();
        String senha = view.getTxtsenha().getText();
        String VI = view.getTxtsaldo().getText();
        
        
        Gerente gerente = new Gerente(CPF,nome,senha,VI,null);
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            GerenteDAO dao = new GerenteDAO(conn);
            dao.inserir(gerente);
            JOptionPane.showMessageDialog(view, "Usuário Cadastrado",
                    "Aviso",
                    JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(view, "Falha na conexão",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
}
