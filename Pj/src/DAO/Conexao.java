import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;




public class Conexao {
    private int g;
    
    public Connection getConnection() throws SQLException{
        Connection conexao = DriverManager.getConnection(
            "jdbc:postgresql://localhost:5432/clientes",
            "postgres", "g");
        return conexao;
    }
}
