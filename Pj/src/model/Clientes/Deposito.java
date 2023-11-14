
package model.Clientes;


public class Deposito {
    private String CPF,valor;

    public Deposito(String valor, String CPF) {
        this.valor = valor;
        this.CPF = CPF;
    }

    public String getvalor() {
        return valor;
    }

    public void setvalor(String valor) {
        this.valor = valor;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    @Override
    public String toString() {
        return "Deposito{" + "valor=" + valor + ", CPF=" + CPF + '}';
    }
    
    
}
