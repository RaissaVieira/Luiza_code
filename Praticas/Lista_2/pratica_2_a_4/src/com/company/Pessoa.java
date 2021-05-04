package com.company;

public class Pessoa {
    String nome;
    Endereco endereco;
    String numero;

    public Endereco consultaEndereco(){
        return endereco;
    }

    public String consultaNome() {
        return nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
