package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe seu nome: ");
        String nome = teclado.nextLine();

        System.out.println("Ola " + nome);

    }
}
