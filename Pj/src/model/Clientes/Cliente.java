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
    private String cpf,senha,tdc,saldo,nome;

    public Cliente(String cpf, String senha,String tdc,String saldo,String nome) {
        this.cpf = cpf;
        this.senha = senha;
        this.tdc = tdc;
        this.saldo = saldo;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getTdc() {
        return tdc;
    }

    public void setTdc(String tdc) {
        this.tdc = tdc;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cpf=" + cpf + ", senha=" + senha + ", tdc=" + tdc + ", saldo=" + saldo + '}';
    }
    
    
    
    
    
    
}
