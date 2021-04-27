package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int opcao=0;
        int numero=0;
        do {
            System.out.println("\n----------Menu----------");
            System.out.println("    1. Raiz quadrada");
            System.out.println("    2. A metade");
            System.out.println("    3. 10% do numero");
            System.out.println("    4. O dobro");
            System.out.println("    5. Sair");
            System.out.println("------------------------\n");

            System.out.print("Digite a opcao escolhida: ");
            opcao = teclado.nextInt();

            System.out.print("Digite o numero: ");
            numero= teclado.nextInt();

            switch (opcao) {
                case 1 -> System.out.printf("A raiz quadrade de %d = %.2f\n", numero, Math.sqrt(numero));
                case 2 -> System.out.printf("A metade de %d = %.2f\n", numero, (double)(numero/2));
                case 3 -> System.out.printf("10%% de %d = %.2f\n", numero, 0.1 * numero);
                case 4 -> System.out.printf("O dobre de %d = %d\n", numero, 2 * numero);
                case 5 -> System.out.println("Volte sempree!");
                default -> System.out.println("Opcao invalida... Tente novamente!");
            }

        }while (opcao != 5);


    }
}
