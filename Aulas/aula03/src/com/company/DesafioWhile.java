package com.company;

import java.util.Scanner;

public class DesafioWhile {

    public static void main(String[] args) {
        double notaU1, notaU2, media;
        int qtdeAprovado = 0;
        int qtdeReprovado = 0;
        String validacao = "Sim";

        Scanner teclado = new Scanner(System.in);

        while (validacao.equals("Sim")) {
            System.out.println("Informe nota U1: ");
            notaU1 = teclado.nextDouble();
            System.out.println("Informe nota U2: ");
            notaU2 = teclado.nextDouble();

            System.out.println("Existe mais alunos?");
            validacao = teclado.next();

            media = (notaU1 + notaU2) / 2;

            if (media >= 7) {
                qtdeAprovado++;
            } else {
                qtdeReprovado++;
            }
        }

        System.out.println("Os alunos aprovados: " + qtdeAprovado);
        System.out.println("Os alunos reprovados: " + qtdeReprovado);

        System.out.println("Huhullllllll... vlws flws!!");
    }
}
