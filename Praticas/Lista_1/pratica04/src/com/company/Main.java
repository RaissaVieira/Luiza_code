package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.printf("Qual o valor do divisor? ");
        int divisor = teclado.nextInt();

        System.out.printf("Qual o valor incial? ");
        int inicio = teclado.nextInt();

        System.out.printf("Qual o valor final? ");
        int fim = teclado.nextInt();

        for (var i=inicio; i<=fim; i++) {
            if (i % divisor == 0) System.out.printf("Numero %d eh divisivel por %d\n", i, divisor);
        }
    }
}
