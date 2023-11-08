package model.Clientes;

public class ExibirExtrato {
    private String CPF,senha;

    public ExibirExtrato() {
    }

    public ExibirExtrato(String CPF, String senha) {
        this.CPF = CPF;
        this.senha = senha;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "ExibirExtrato{" + "CPF=" + CPF + ", senha=" + senha + '}';
    }
    
    
    
}
