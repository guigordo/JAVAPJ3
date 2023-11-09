
package controller;

import DAO.ClientesDAO;
import DAO.Conexao;
import model.Clientes.Cliente;
import view.LoginFrame;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ControllerLogin {
    
    private LoginFrame view;
    
    public ControllerLogin(LoginFrame view){
        this.view = view;
    }
    
    public void loginCliente(){
        Cliente cliente = new Cliente(null,view.getTxtcpf().getText());
        view.getTxtsenha().getText();
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            ClientesDAO dao = new ClientesDAO(conn);
            ResultSet res = dao.consultar(cliente);
        }
   
}
