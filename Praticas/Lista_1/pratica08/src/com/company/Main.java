package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int op;
        List<String> names = new ArrayList<String>();

        names.add("Tainá");
        names.add("Stellinha");
        names.add("Tequillina");
        names.add("Pituzinha");
        names.add("Raissa");

        System.out.println("---------------------------------------------------");
        System.out.println("1. Tainá\n" +
                "2. Stellinha\n" +
                "3. Tequillina\n" +
                "4. Pituzinha\n" +
                "5. Raissa");
        System.out.println("Qual dos nome abaixo voce deseja excluir da lista?");
        System.out.println("---------------------------------------------------");

        op = teclado.nextInt()-1;

        System.out.printf("%s foi removida! Verifique: \n", names.get(op));

        names.remove(op);

        for (Object value : names){
            System.out.println(value);
        }
    }
}
