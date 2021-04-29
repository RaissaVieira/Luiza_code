package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Produto sanduiche = new Produto(594, "Sanduiche natural");
        Produto coca = new Produto(836, "Coca-cola");

        Compra compra = new Compra();
        Pessoa pessoa = new Pessoa();
        Endereco endereco = new Endereco();

        System.out.println("Iniciaremos seu cadastro.");
        System.out.print("Digite seu nome: ");
        pessoa.setNome(teclado.nextLine());

        System.out.print("Digite seu numero: ");
        pessoa.setNumero(teclado.next());

        System.out.println("Para finalizar o cadastro informe os seguintes dados.");

        System.out.print("Digite seu logradouro: ");
        endereco.setLogradouro(teclado.next());

        System.out.print("Digite sua cidade: ");
        endereco.setCidade(teclado.next());

        System.out.print("Digite seu estado: ");
        endereco.setEstado(teclado.next());

        pessoa.setEndereco(endereco);

        System.out.println("Agora voce ja pode fazer seu pedido!!");
        System.out.println("\n------------Menu------------");
        System.out.println("594 Sanduiche natural\n" +
                           "836 Coca-cola");
        System.out.println("----------------------------");
        System.out.print("\nDigite o codigo do produto: ");
        long codSel = teclado.nextLong();

        if (codSel == 594) {
            compra.comprar(pessoa, sanduiche);
        } else if (codSel == 836) {
            compra.comprar(pessoa, coca);
        } else {
            System.out.println("Codigo invalido");
        }

        System.out.println("\nProduto selecionado foi: " + compra.verficarCompra());
    }
}
