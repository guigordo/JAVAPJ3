package model.Clientes;

public class Debito {
    private String CPF,TDC,senha,valor;

    public Debito() {
    }

    public Debito(String CPF, String TDC, String senha, String valor) {
        this.CPF = CPF;
        this.TDC = TDC;
        this.senha = senha;
        this.valor = valor;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getTDC() {
        return TDC;
    }

    public void setTDC(String TDC) {
        this.TDC = TDC;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Debito{" + "CPF=" + CPF + ", TDC=" + TDC + ", senha=" + senha + ", valor=" + valor + '}';
    }
    
    
}
