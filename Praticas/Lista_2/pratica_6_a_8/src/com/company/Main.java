package com.company;

public class Main {

    public static void main(String[] args) {
        Professora profTaina = new Professora("Tainá", "Introducao a Java", "12345678952");

        Aluna aluna1 = new Aluna("Raissa",8.5, 5);
        Aluna aluna2 = new Aluna("Bruna",9,7);
        Aluna aluna3 = new Aluna("Mel",10,6.5);

        System.out.printf("A professora %s leciona o curso de %s\n", profTaina.getNome(), profTaina.getCurso());

        // Calculo de salaria com 40 hrs de aula
        profTaina.calculaSalario(40);

        System.out.printf("O salario da professora %s eh: %.2f\n", profTaina.getNome(), profTaina.getSalario());

        profTaina.getAlunos().add(aluna1);
        profTaina.getAlunos().add(aluna2);
        profTaina.getAlunos().add(aluna3);

        profTaina.getAlunos().get(0).calcularMedia(aluna1);
        profTaina.getAlunos().get(1).calcularMedia(aluna2);
        profTaina.getAlunos().get(2).calcularMedia(aluna3);

    }
}
