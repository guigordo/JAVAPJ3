
package model.Clientes;

public class Debito {
    private String cpf,tdc,senha,valor;

    public Debito(String cpf, String tdc, String senha, String valor) {
        this.cpf = cpf;
        this.tdc = tdc;
        this.senha = senha;
        this.valor = valor;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTdc() {
        return tdc;
    }

    public void setTdc(String tdc) {
        this.tdc = tdc;
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
        return "Debito{" + "cpf=" + cpf + ", tdc=" + tdc + ", senha=" + senha + ", valor=" + valor + '}';
    }
    
    
    
}
