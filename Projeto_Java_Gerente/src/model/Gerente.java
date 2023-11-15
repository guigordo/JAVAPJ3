
package model;


public class Gerente {
    private String CPF,nome,senha,saldo,tdc;

    public Gerente() {
    }

    public Gerente(String CPF, String nome, String senha, String saldo,String tdc) {
        this.CPF = CPF;
        this.nome = nome;
        this.senha = senha;
        this.saldo = saldo;
        this.tdc = tdc;
    }

    public String getTdc() {
        return tdc;
    }

    public void setTdc(String tdc) {
        this.tdc = tdc;
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

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Gerente{" + "CPF=" + CPF + ", nome=" + nome + ", senha=" + senha + ", saldo=" + saldo + '}';
    }
       
}
