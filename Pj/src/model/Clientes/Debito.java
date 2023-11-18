package model.Clientes;

public class Debito {
    private String cpf,tdc,valor;

    public Debito(String cpf, String tdc, String valor) {
        this.cpf = cpf;
        this.tdc = tdc;
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

    

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Debito{" + "cpf=" + cpf + ", tdc=" + tdc + ", valor=" + valor + '}';
    }

    
    
    
    
}
