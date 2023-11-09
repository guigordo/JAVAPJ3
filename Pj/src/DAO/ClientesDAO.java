package DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import model.Clientes.Cliente;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ClientesDAO{
    private Connection conn;
    
    public ClientesDAO(Connection conn){
        this.conn = conn;
    }
    
    public ResultSet consultar(Cliente cliente) throws SQLException{
        String sql = "select * from clientes where = ? and senha = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(0, cliente.getCpf());
        statement.setString(1, cliente.getSenha());
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        return resultado;
    }
    
    
}
