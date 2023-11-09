
package DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Gerente;



public class GerenteDAO {
    private Connection conn;

    public GerenteDAO(Connection conn) {
        this.conn = conn;
    }
    
    public ResultSet consultar(Gerente gerente) throws SQLException{
        String sql = "select * from clientes where = ? and senha = ? ";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, gerente.getCPF());
        statement.setString(0, gerente.getNome());
        statement.setString(3, gerente.getVI());
        statement.setString(2, gerente.getSenha());
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        return resultado;        
    }
    
    public void inserir(Gerente gerente) throws SQLException{
        String sql = "insert into clientes (nome,cpf,senha,vi) values ('" +
                gerente.getNome() + "','" + gerente.getCPF() + "', '" +
                gerente.getSenha() + "', '" + gerente.getVI() + "')";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.execute();
        conn.close();
    }
    
    public void atualizar(Gerente gerente) throws SQLException{
        String sql = "update clientes set senha = ? where cpf = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, gerente.getCPF());
        statement.setString(2, gerente.getSenha());
        statement.execute();
        conn.close();
        
    }
    
    public void remover(Gerente gerente) throws SQLException{
        String sql = "delete from clientes where cpf = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, gerente.getCPF());
        statement.execute();
        conn.close();
        
    }
    
    
}
