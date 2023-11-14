package controller;

import DAO.ClientesDAO;
import DAO.Conexao;
import model.Clientes.Cliente;
import model.Clientes.Debito;
import view.DebitoFrame;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class ControllerDebito {
    private DebitoFrame view;

    public ControllerDebito(DebitoFrame view) {
        this.view = view;
    }
    
    public void opDebito(){
        String cpf = view.getTxtcpf().getText();
        String senha = view.getTxtsenha().getText();
        String valor = view.getTxtvalor().getText();
        String tdc = view.getTxtconta().getText();
        
        Cliente cliente = new Cliente(cpf, senha, valor, tdc);
        Debito debito = new Debito(cpf, senha, valor, tdc);
        Conexao conexao = new Conexao();
        
        try {
            Connection conn = conexao.getConnection();
            ClientesDAO dao = new ClientesDAO(conn);

            
            dao.atualizarSaldo(debito);
            
            ResultSet rss = dao.consultar(cliente);
            
            if (rss.next()) {
                double valorDebito = Double.parseDouble(valor);
                
                if (tdc.equals("Salario")) {
                    double taxa = 0.05;
                    double valorComTaxa = valorDebito * (1 + taxa);
                    
                    double saldoAtual = Double.parseDouble(cliente.getSaldo());
                    
                    debito.setValor(Double.toString(valorComTaxa));
                    cliente.setSaldo(Double.toString(saldoAtual - valorComTaxa));
                    
                } else if (tdc.equals("Corrente")) {
                    double taxa = 0.01;
                    double valorComTaxa = valorDebito * (1 + taxa);
                    
                    double saldoAtual = Double.parseDouble(cliente.getSaldo());
                    
                    debito.setValor(Double.toString(valorComTaxa));
                    cliente.setSaldo(Double.toString(saldoAtual - valorComTaxa));
                } else if (tdc.equals("Poupança")) {
                    double saldoAtual = Double.parseDouble(cliente.getSaldo());
                    
                    debito.setValor(Double.toString(saldoAtual));
                    cliente.setSaldo(Double.toString(saldoAtual - valorDebito));
                }
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(view, "Erro ao realizar o débito.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
