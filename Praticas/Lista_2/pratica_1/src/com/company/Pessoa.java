package com.company;

public class Pessoa {
    String Nome;
    int Idade;
    long CNH;

    public Pessoa(String nome, int idade, long CNH) {
        Nome = nome;
        Idade = idade;
        this.CNH = CNH;
    }

    void Dirigir(){
        System.out.println("Voce esta dirigindo. Preste atencao no transito!");
    }

    void Dormir (){
        System.out.println("Hora de ir dormir. Ja deu por hoje!");
    }

    void Comer() {
        System.out.println("Coma bem!");
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }

    public long getCNH() {
        return CNH;
    }

    public void setCNH(int CNH) {
        this.CNH = CNH;
    }

}
