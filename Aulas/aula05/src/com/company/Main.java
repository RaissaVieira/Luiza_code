package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // Exemplo de Carro
        Carro carro = new Carro("Porshe","Preto","NPZ-4283",4);
        Pessoa pessoa = new Pessoa("Raissa", 19, 17086727);

        System.out.printf("Tipo do carro: %s\n", carro.getTipo());
        System.out.printf("Cor do carro: %s\n", carro.getCor());
        System.out.printf("Placa do carro: %s\n", carro.getPlaca());
        System.out.printf("Numero de portas do carro: %s\n", carro.getNumeroDePortas());
        carro.Ligar();
        System.out.println("Dobro do numero de portas do carro: " + carro.dobroPortas());
        carro.setDono(pessoa);
        System.out.println("A dona desse carro eh " + carro.getDono().getNome());

        // Exemplo de Pessoa
        //Pessoa pessoa = new Pessoa("Raissa", 19, 17086727);

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
