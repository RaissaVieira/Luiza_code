package com.company;

public class Funcionario {
    protected String nome;
    protected String cpf;
    protected double salario;
    protected int senha;

    public boolean autenticar(int senha) {
        if(this.senha == senha){
            System.out.println("Acesso permitido");
            return true;
        }else {
            System.out.println("Acesso negado");
            return false;
        }
    }

    public void verInformacoes() {
        System.out.println("---------------------------");
        System.out.println("Informacoes do funcionario");
        System.out.println("Nome: " + this.nome);
        System.out.println("Cpf: " + this.cpf);
        System.out.println("Salario: " + this.salario);
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
}
