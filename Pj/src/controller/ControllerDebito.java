package controller;

import DAO.ClientesDAO;
import DAO.Conexao;
import model.Clientes.Cliente;
import model.Clientes.Debito;
import view.DebitoFrame;
import java.sql.Connection;
import java.sql.ResultSet;

public class ControllerDebito {
    private DebitoFrame view;

    public ControllerDebito(DebitoFrame view) {
        this.view = view;
    }
    
    public void opDebito(){
        Cliente debito = new Cliente(view.getTxtcpf().getText(),view.getTxtsenha().getText(),view.getTxtvalor().getText(),view.getTxtconta().getText());
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            ClientesDAO dao = new ClientesDAO(conn);
            ResultSet res = dao.consultar(debito);
            
        }catch
    
}
    
}
