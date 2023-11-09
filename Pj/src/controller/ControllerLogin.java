
package controller;

import DAO.Conexao;
import model.Clientes.Cliente;
import view.LoginFrame;

public class ControllerLogin {
    
    private LoginFrame view;
    
    public ControllerLogin(LoginFrame view){
        this.view = view;
    }
    
    public void loginCliente(){
        Cliente cliente = new Cliente(null,view.getTxtcpf().getText());
        view.getTxtsenha().getText();
        Conexao conexao = new Conexao();
    }
    
   
}
