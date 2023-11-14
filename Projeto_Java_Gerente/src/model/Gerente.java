
package model;


public class Gerente {
    private String CPF,nome,senha,saldo;

    public Gerente() {
    }

    public Gerente(String CPF, String nome, String senha, String saldo) {
        this.CPF = CPF;
        this.nome = nome;
        this.senha = senha;
        this.saldo = saldo;
    }
    
    
    
    
    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getsaldo() {
        return saldo;
    }

    public void setsaldo(String saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Gerente{" + "CPF=" + CPF + ", nome=" + nome + ", senha=" + senha + ", saldo=" + saldo + '}';
    }
    
    
    
}
