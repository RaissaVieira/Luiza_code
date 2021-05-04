package com.company;

public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;
    private Conta conta;

    public Pessoa(String nome, String cpf, String endereco, Conta conta) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.conta = conta;
    }

    public void adicionarConta(Conta conta){
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
}
