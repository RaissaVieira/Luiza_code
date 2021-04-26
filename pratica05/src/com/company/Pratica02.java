package com.company;

import java.util.ArrayList;
import java.util.List;

public class Pratica02 {

    public static void main(String[] args) {
        List values = new ArrayList();

        values.add("Dia");
        values.add(586);
        values.add(true);
        values.add(8.99);
        values.add("Hora de estudar");
        values.add("O");
        values.add(new Object());
        values.add(Math.PI);
        values.add(false);
        values.add(Math.sqrt(2));

        for (Object value : values){
            System.out.println(value);
        }
    }
}
