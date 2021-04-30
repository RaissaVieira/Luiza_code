package com.company;

public class Gerente extends Funcionario {
    private int numFuncionariosGerenciados;

    public int getNumFuncionariosGerenciados() {
        return numFuncionariosGerenciados;
    }

    public void setNumFuncionariosGerenciados(int numFuncionariosGerenciados) {
        this.numFuncionariosGerenciados = numFuncionariosGerenciados + 1;
    }

    public void verInformacoes() {
        super.verInformacoes();
        System.out.println("Numero de funcionarios gerenciados: " + this.numFuncionariosGerenciados);
    }
}
