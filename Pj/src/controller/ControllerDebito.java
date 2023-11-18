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
    public void opDebito() {
    String cpf = view.getTxtcpf().getText();
    String valor = view.getTxtvalor().getText();
    String tipoConta = view.getTxtconta().getText();

    Cliente cliente = new Cliente(cpf, null, valor, tipoConta, null);
    Debito debito = new Debito(cpf,tipoConta,valor);
    Conexao conexao = new Conexao();

    try {
        Connection conn = conexao.getConnection();
        ClientesDAO dao = new ClientesDAO(conn);

        ResultSet resultSet = dao.consultarClientePorCPF(cliente);

        if (resultSet.next()) {
            String nome = resultSet.getString("nome"); // Substitua "nome" pelo nome do campo na tabela
            String saldo = resultSet.getString("saldo"); // Substitua "saldo" pelo nome do campo na tabela

            double saldoAtual = Double.parseDouble(saldo);
            double valorDebito = Double.parseDouble(valor);
            double novoSaldo = 0;

            if (tipoConta.equals("salario")) {
                double taxa = 0.05;
                novoSaldo = saldoAtual - (valorDebito * (1 + taxa));
            } else if (tipoConta.equals("corrente")) {
                double taxa = 0.01;
                novoSaldo = saldoAtual - (valorDebito * (1 + taxa));
            } else if (tipoConta.equals("poupança")) {
                novoSaldo = saldoAtual - valorDebito;
            }

            cliente = new Cliente(cpf, nome, valor, tipoConta, Double.toString(novoSaldo));
            dao.atualizarSaldo(debito);
            JOptionPane.showMessageDialog(view, "Débito realizado com sucesso.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(view, "Conta não encontrada.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(view, "Erro ao realizar o débito: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    }
}


    
}
