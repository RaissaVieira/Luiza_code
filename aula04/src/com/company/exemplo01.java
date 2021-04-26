package com.company;

public class exemplo01 {
    public static void main(String[] args) {
        String[] mes = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        int[] tot = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (var i = 0; i < tot.length; i++) {
            System.out.printf("O mes de %s tem %d dias\n", mes[i], tot[i]);
        }
    }
}
