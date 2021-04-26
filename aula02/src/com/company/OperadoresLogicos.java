package com.company;

public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean P = 7 > 7;
        boolean Q = "T" == "T";
        boolean R = (2+10) != (3+7);

        System.out.println(P);
        System.out.println(Q);
        System.out.println(R);
        System.out.println(P && Q && R);
        System.out.println(P || Q && R);
        System.out.println(P || Q || R);

    }
}
