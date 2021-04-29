package com.company;

import java.util.ArrayList;
import java.util.List;

public class Professora {
    private String nome;
    private String curso;
    private String cpf;
    private double salario;
    private List<Aluna> alunos = new ArrayList<Aluna>();

    public Professora(String nome, String curso, String cpf) {
        this.nome = nome;
        this.curso = curso;
        this.cpf = cpf;
    }

    public void calculaSalario(int horasAula){
        this.salario = 29.00 * horasAula;
    }

    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }

    public double getSalario() {
        return salario;
    }

    public List<Aluna> getAlunos() {
        return alunos;
    }
}
