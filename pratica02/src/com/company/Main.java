package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o codigo do item escolhido: ");
        int cod = teclado.nextInt();

        System.out.print("Digite a quantidade: ");
        int quantidade = teclado.nextInt();

        double total;
        switch (cod) {
            case 100 -> {
                total = 1.20 * quantidade;
                System.out.printf("Voce pediu %d cachorro quente e o total foi de %.2f reais", quantidade, total);
            }
            case 101 -> {
                total = 1.30 * quantidade;
                System.out.printf("Voce pediu %d bauru simples e o total foi de %.2f reais", quantidade, total);
            }
            case 102 -> {
                total = 1.50 * quantidade;
                System.out.printf("Voce pediu %d bauru simples com ovo e o total foi de %.2f reais", quantidade, total);
            }
            case 103 -> {
                total = 1.20 * quantidade;
                System.out.printf("Voce pediu %d hamburger e o total foi de %.2f reais", quantidade, total);
            }
            case 104 -> {
                total = 1.30 * quantidade;
                System.out.printf("Voce pediu %d cheeseburguer e o total foi de %.2f reais", quantidade, total);
            }
            case 105 -> {
                total = 1.00 * quantidade;
                System.out.printf("Voce pediu %d refrigerante e o total foi de %.2f reais", quantidade, total);
            }
            default -> System.out.println("Codigo invalido");
        }
    }
}
