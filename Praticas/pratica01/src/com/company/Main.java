package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner teclado = new Scanner(System.in);

        System.out.print("Qual a sua altura? ");
        double altura = teclado.nextDouble();

        System.out.print("Qual a sua massa? ");
        double massa = teclado.nextDouble();

        double IMC = massa / Math.pow(altura,2);

        System.out.printf("O valor do seu IMC é: %.2f", IMC);
    }
}
