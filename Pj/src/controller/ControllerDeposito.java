
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
        
}
