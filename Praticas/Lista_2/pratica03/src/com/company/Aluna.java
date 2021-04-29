package com.company;

public class Aluna {
    String nome;
    double nota1, nota2;

    public Aluna(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public void calcularMedia(Aluna aluna) {
        double media = (aluna.nota1 + aluna.nota2)/2;

        if (media >= 7){
            System.out.printf("A aluna %s foi APROVADA com media = %.2f.\n", aluna.nome, media);
        }else {
            System.out.printf("A aluna %s foi REPROVADA com media = %.2f.\n", aluna.nome, media);
        }
    }
}
