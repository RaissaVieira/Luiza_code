package com.company;

public class Main {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Raissa", 19, 17086727);

        pessoa.setNome("Raissa");
        pessoa.setIdade(19);
        pessoa.setCNH(17086727);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("CNH: " + pessoa.getCNH());
        pessoa.Dirigir();
        pessoa.Dormir();
        pessoa.Comer();

    }
}
