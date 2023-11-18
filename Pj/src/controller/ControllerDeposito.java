
package controller;

import DAO.ClientesDAO;
import DAO.Conexao;
import model.Clientes.Cliente;
import view.DepositoFrame;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import model.Clientes.Deposito;

public class ControllerDeposito {
    private DepositoFrame view;

    public ControllerDeposito(DepositoFrame view) {
        this.view = view;
    }
    
    public void opDeposito() {
        String cpf = view.getTxtcpf().getText();
        String valor = view.getTxtvalor().getText();
        
        
        
        Cliente cliente = new Cliente(cpf,null , valor, null,null);
        Deposito deposito = new Deposito(valor,cpf);  

        Conexao conexao = new Conexao();
        try {
            Connection conn = conexao.getConnection();
            ClientesDAO dao = new ClientesDAO(conn);

            
            dao.atualizarSaldoDeposito(deposito);

            ResultSet rss = dao.consultar(cliente);

            if (rss.next()) {
                double valorDeposito = Double.parseDouble(valor);

                

                double saldoAtual = Double.parseDouble(cliente.getSaldo());

                deposito.setvalor(Double.toString(valorDeposito));
                cliente.setSaldo(Double.toString(saldoAtual + valorDeposito));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(view, "Erro ao realizar o depósito.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
