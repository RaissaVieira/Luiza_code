package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Pratica03 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();

        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Qual eh o nome da vez? ");
            names.add(teclado.next());
        }

        Collections.reverse(names);

        for (Object value : names){
            System.out.println(value);
        }
    }
}
