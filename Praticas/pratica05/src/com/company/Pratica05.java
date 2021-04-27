package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Pratica05 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        Random aleatorio = new Random();

        System.out.println("Lista: ");
        for (int i = 0; i < 10; i++) {
            int valor = aleatorio.nextInt(91) + 10;
            numbers.add(valor);
            System.out.printf("%d ", valor);
        }

        System.out.printf("\nO maior numero da lista eh: %d", Collections.max(numbers));

    }
}
