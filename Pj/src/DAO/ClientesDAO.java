package DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import model.Clientes.Cliente;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Clientes.Debito;
import model.Clientes.Deposito;


public class ClientesDAO{
    private Connection conn;
    
    public ClientesDAO(Connection conn){
        this.conn = conn;
    }
    
    public ResultSet consultar(Cliente cliente) throws SQLException{
        String sql = "select * from cliente where = ? and senha = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(0, cliente.getCpf());
        statement.setString(1, cliente.getSenha());
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        return resultado;
    }
    
    public void atualizarSaldo(Debito debito) throws SQLException {
        String sql = "update cliente SET saldo = ? where cpf = ?";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            double novoSaldo = Double.parseDouble(debito.getValor());
            
            statement.setDouble(1, novoSaldo);
            statement.setString(2, debito.getCpf());
            statement.executeUpdate();
            
        }
    }
    
    public void atualizarSaldoDeposito(Deposito deposito) throws SQLException{
        String sql = "update cliente SET saldo = ? where cpf = ?";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {

        statement.setString(1, deposito.getvalor());
        statement.setString(2, deposito.getCPF());
        statement.executeUpdate();
        }
    }
    public ResultSet consultarSaldo(Cliente cliente) {
        String sql = "SELECT saldo FROM cliente WHERE cpf = ?";

        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, cliente.getCpf());

            return statement.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
