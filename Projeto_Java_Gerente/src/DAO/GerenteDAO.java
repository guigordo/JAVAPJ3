package DAO;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Delete;
import model.Gerente;
import model.TipoDeConta;
import java.sql.ResultSet;



public class GerenteDAO {
    private Connection conn;

    public GerenteDAO(Connection conn) {
        this.conn = conn;
    }
    
    public void inserir(Gerente gerente) throws SQLException{
        String sql = "insert into cliente(nome,cpf,saldo,tdc,senha) values ('"+gerente.getNome()+
                                          "', '"+gerente.getCPF()+"', '"+
                                          gerente.getSaldo()+"', '"+
                                          gerente.getTdc()+"', '"+
                                          gerente.getSenha()+"')";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.execute();
        conn.close();
                                                        
    }
    
    public void remover(Delete delete) throws SQLException{
        String sql = "delete from cliente where cpf = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, delete.getCpf());
        statement.execute();
        conn.close();
    }
    
    public void contaSalario(TipoDeConta tipodc) throws SQLException{
        String sql = "UPDATE cliente set tdc = 'salario' where cpf = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, tipodc.getCpf());
        statement.execute();
        conn.close();
    }
    public void contaPoupanca(TipoDeConta tipodc) throws SQLException{
        String sql = "UPDATE cliente set tdc = 'poupança' where cpf = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, tipodc.getCpf());
        statement.execute();
        conn.close();
    
    }
    public void contaCorrente(TipoDeConta tipodc) throws SQLException{
        String sql = "UPDATE cliente set tdc = 'corrente' where cpf = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, tipodc.getCpf());
        statement.execute();
        conn.close();
    }
    public List<Gerente> obterTodasContas() throws SQLException {
        List<Gerente> contas = new ArrayList<>();
        String sql = "select * from cliente";

        PreparedStatement statement = conn.prepareStatement(sql);
        ResultSet result = statement.executeQuery();

        while (result.next()) {
            
            String nome = result.getString("nome");
            String cpf = result.getString("cpf");
            String saldo = result.getString("saldo");
            String tdc = result.getString("tdc");
            String senha = result.getString("senha");

            Gerente gerente = new Gerente(cpf, nome, senha, saldo, tdc);
            contas.add(gerente);
        }

        conn.close();
        return contas;
    }
}
    

    
//    public ResultSet consultar(Gerente gerente) throws SQLException{
//        String sql = "select * from cliente where = ? and senha = ? ";
//        PreparedStatement statement = conn.prepareStatement(sql);
//        statement.setString(1, gerente.getCPF());
//        statement.setString(0, gerente.getNome());
//        statement.setString(3, gerente.getsaldo());
//        statement.setString(2, gerente.getSenha());
//        statement.execute();
//        ResultSet resultado = statement.getResultSet();
//        return resultado;        
//    }
//    
//    public void inserir(Gerente gerente) throws SQLException{
//        String sql = "insert into cliente (nome,CPF,senha,VI) values ('" +
//                gerente.getNome() + "','" + gerente.getCPF() + "', '" +
//                gerente.getSenha() + "', '" + gerente.getsaldo() + "')";
//        PreparedStatement statement = conn.prepareStatement(sql);
//        statement.execute();
//        conn.close();
//    }
//    
//    public void atualizar(Gerente gerente) throws SQLException{
//        String sql = "update cliente set senha = ? where CPF = ?";
//        PreparedStatement statement = conn.prepareStatement(sql);
//        statement.setString(1, gerente.getCPF());
//        statement.setString(2, gerente.getSenha());
//        statement.execute();
//        conn.close();
//        
//    }
//    
//    public void remover(Gerente gerente) throws SQLException{
//        String sql = "delete from cliente where CPF = ?";
//        PreparedStatement statement = conn.prepareStatement(sql);
//        statement.setString(1, gerente.getCPF());
//        statement.execute();
//        conn.close();
//        
//    }

