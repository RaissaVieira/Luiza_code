package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner teclado = new Scanner(System.in);

        System.out.print("Valor da primeira nota: ");
        float nota1 = teclado.nextFloat();

        System.out.print("Valor da segunda nota: ");
        float nota2 = teclado.nextFloat();

        float media = (nota1 + nota2)/2;

        String resultado = media >= 7 ? "Aprovadx" : "Reprovadx";

        System.out.printf("Voce foi %s", resultado);
    }
}
