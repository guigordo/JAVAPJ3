/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Clientes;

/**
 *
 * @author Administrador
 */
public class Cliente {
    private String cpf,senha;

    public Cliente(String cpf, String senha) {
        this.cpf = cpf;
        this.senha = senha;
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cpf=" + cpf + ", senha=" + senha + '}';
    }
    
    
    
}
