package controller;

import DAO.ClientesDAO;
import DAO.Conexao;
import model.Clientes.Cliente;
import view.SaldoContaFrame;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ControllerExibirSaldo {
    private SaldoContaFrame view;

    public ControllerExibirSaldo(SaldoContaFrame view) {
        this.view = view;
    }

    public void exibirSaldo(String cpf) {
        Cliente cliente = new Cliente(cpf, null, null, null, null);
        Conexao conexao = new Conexao();
        

        try {
            Connection conn = conexao.getConnection();
            ClientesDAO dao = new ClientesDAO(conn);
            ResultSet res = dao.consultarSaldo(cliente);

            if (res.next()) {
                String saldo = res.getString("saldo");
                view.mostrarSaldo(saldo);
            } else {
                JOptionPane.showMessageDialog(view, "Cliente não encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(view, "Erro ao obter o saldo: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
}

