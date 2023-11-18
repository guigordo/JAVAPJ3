package DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import model.Clientes.Cliente;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Clientes.Debito;
import model.Clientes.Deposito;


public class ClientesDAO{
    private Connection conn;
    
    public ClientesDAO(Connection conn){
        this.conn = conn;
    }
    
    public ResultSet consultar(Cliente cliente) throws SQLException{
        String sql = "select * from cliente where cpf = ? and senha = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, cliente.getCpf());
        statement.setString(2, cliente.getSenha());
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        return resultado;
    }
    
    
    public void atualizarSaldo(Debito debito) throws SQLException {
        String sql = "update cliente set saldo = ? where cpf = ?";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, debito.getValor());
            statement.setString(2, debito.getCpf());
            statement.execute();
            
        }catch(SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Erro ao atualizar saldo: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    } 
    
    public ResultSet consultarClientePorCPF(Cliente cliente) throws SQLException {
        String sql = "select * from cliente where cpf = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, cliente.getCpf()); 
        return statement.executeQuery();
    }

    
    public void atualizarSaldoDeposito(Deposito deposito) throws SQLException{
        String sql = "update cliente  saldo = ? where cpf = ?";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {

        statement.setString(1, deposito.getvalor());
        statement.setString(2, deposito.getCPF());
        statement.executeUpdate();
        }
    }
    public ResultSet consultarSaldo(Cliente cliente) {
        String sql = "select saldo from cliente where cpf = ?";

        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, cliente.getCpf());

            return statement.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
