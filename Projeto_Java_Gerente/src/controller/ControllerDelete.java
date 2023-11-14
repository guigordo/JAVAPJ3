package controller;

import DAO.Conexao;
import DAO.GerenteDAO;
import view.ExcluirContaFrame;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import model.Delete;
import model.Gerente;


public class ControllerDelete {
    
    private ExcluirContaFrame view;

    public ControllerDelete(ExcluirContaFrame view) {
        this.view = view;
    }
    
    
    public void excluirCliente(){
        Delete delete = new Delete(view.getTxtcpf().getText());
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            GerenteDAO dao = new GerenteDAO(conn);
            dao.remover(delete);
            JOptionPane.showMessageDialog(view, "Conta Deletada", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(view, "Falha na conexão", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
