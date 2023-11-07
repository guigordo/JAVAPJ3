
package model;


public class Gerente {
    private int CPF,nome,senha,VI;

    public Gerente() {
    }

    public Gerente(int CPF, int nome, int senha, int VI) {
        this.CPF = CPF;
        this.nome = nome;
        this.senha = senha;
        this.VI = VI;
    }
    
    
    
    
    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public int getNome() {
        return nome;
    }

    public void setNome(int nome) {
        this.nome = nome;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getVI() {
        return VI;
    }

    public void setVI(int VI) {
        this.VI = VI;
    }

    @Override
    public String toString() {
        return "Gerente{" + "CPF=" + CPF + ", nome=" + nome + ", senha=" + senha + ", VI=" + VI + '}';
    }
    
    
    
}
