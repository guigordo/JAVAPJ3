
package model;

public class Delete {
    String cpf;

    public Delete(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Delete{" + "cpf=" + cpf + '}';
    }
    
}
