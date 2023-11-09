
package model;


public class Gerente {
    private String CPF,nome,senha,VI;

    public Gerente() {
    }

    public Gerente(String CPF, String nome, String senha, String VI) {
        this.CPF = CPF;
        this.nome = nome;
        this.senha = senha;
        this.VI = VI;
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

    public String getVI() {
        return VI;
    }

    public void setVI(String VI) {
        this.VI = VI;
    }

    @Override
    public String toString() {
        return "Gerente{" + "CPF=" + CPF + ", nome=" + nome + ", senha=" + senha + ", VI=" + VI + '}';
    }
    
    
    
}
