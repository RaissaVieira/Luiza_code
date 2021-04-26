package com.company;

import java.util.Scanner;

public class Condicional {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Qual a sua altura? ");
        double altura = teclado.nextDouble();

        System.out.print("Qual a sua massa? ");
        double massa = teclado.nextDouble();

        double IMC = massa / Math.pow(altura,2);

        if (IMC < 19.1) {
            System.out.println("Seu quadro eh: abaixo do peso!");
        } else if (IMC >= 19.1 && IMC<25.8) {
            System.out.println("Seu quadro eh: peso normal!");
        } else if (IMC >= 25.8 && IMC<27.3) {
            System.out.println("Seu quadro eh: marginalmente acima do peso!");
        } else if (IMC >= 27.3 && IMC<32.3) {
            System.out.println("Seu quadro eh: marginalmente acima do peso!");
        } else {
            System.out.println("Seu quadro eh: obeso!");
        }
    }
}
