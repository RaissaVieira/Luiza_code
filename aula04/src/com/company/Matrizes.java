package com.company;

import java.util.Arrays;

public class Matrizes {

    public static void main(String[] args) {

        // Declaracao
        int[] num = {1,2,3,5,6};
        int[] numbers = new int[5];

        // Atribuicao
        numbers[0] = 8;
        numbers[1] = 6;
        numbers[2] = 85;
        numbers[3] = 23;
        numbers[4] = 35;
        // ...

        // Tamanho do vetor
        int tamanho = numbers.length;
        System.out.println("O tamanho eh " + tamanho);

        // Pecorrer um vetor

        for (int i : numbers) {
            System.out.println(i);
        }

        // Ordenar vetor
        Arrays.sort(numbers);
        System.out.println("Array ordenado: ");
        for (int i : numbers) {
            System.out.println(i);
        }
    }
}
