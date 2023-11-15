package controller;

import DAO.Conexao;
import DAO.GerenteDAO;
import model.TipoDeConta;
import view.TipoContaFrame;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ControllerTdc {
    
    private TipoContaFrame view;

    public ControllerTdc(TipoContaFrame view) {
        this.view = view;
    }
    
    public void escolherContaPoupanca(){
        TipoDeConta tipodc = new TipoDeConta(view.getTxtcpf().getText());
        Conexao conexao = new Conexao();
        
        try{
            Connection conn = conexao.getConnection();
            GerenteDAO dao = new GerenteDAO(conn);
            dao.contaPoupanca(tipodc);
            JOptionPane.showMessageDialog(view, "Tipo de conta selecionada", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(view, "Falha na Conexão","Erro",JOptionPane.ERROR_MESSAGE);
        }
    }
    public void escolherContaSalario(){
        TipoDeConta tipodc = new TipoDeConta(view.getTxtcpf().getText());
        Conexao conexao = new Conexao();
        
        try{
            Connection conn = conexao.getConnection();
            GerenteDAO dao = new GerenteDAO(conn);
            dao.contaSalario(tipodc);
            JOptionPane.showMessageDialog(view, "Tipo de conta selecionada", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(view, "Falha na Conexão","Erro",JOptionPane.ERROR_MESSAGE);
        }
    }
    public void escolherContaCorrente(){
        TipoDeConta tipodc = new TipoDeConta(view.getTxtcpf().getText());
        Conexao conexao = new Conexao();
        
        try{
            Connection conn = conexao.getConnection();
            GerenteDAO dao = new GerenteDAO(conn);
            dao.contaCorrente(tipodc);
            JOptionPane.showMessageDialog(view, "Tipo de conta selecionada", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(view, "Falha na Conexão","Erro",JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
