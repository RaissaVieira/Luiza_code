package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Colections {
    public static void main(String[] args) {
        // List - eh uma interface e o ArrayList eh sua implementacao
        // List <Type> name = new ArrayList<>();
        // List eh uma sequencia ordenada
        // Aceita elementos repetidos
        List<String> name = new ArrayList<>();
        List<String> surname = new ArrayList<>();

        name.add("Raissa");
        name.add("Gisele");
        name.add("Lavinia");

        // Ordenar uma lista
        Collections.sort(name);

        for (Object nome: name) {
            System.out.println(nome);
        }

        surname.add("Fofinha");
        surname.add("Gi");
        surname.add("Nina");

        // Unir duas listas
        name.addAll(surname);
        for (Object nome: name) {
            System.out.println(nome);
        }

        // Busca na lista
        int i = Collections.binarySearch(name, "Raissa");
        System.out.println("Indice correspondente: " + i);
        // Se o elemento nao esta na lista, retorna um valor negativo

        // Set - Set eh a interface e setHash eh a implementacao
        // Lista de elementos que nao eh ordenado
        // Nao aceita elementos repetidos

        // Map

    }
}
