package com.company;

public class Main {

    public static void main(String[] args) {
	    // ENCAPSULAMENTO
        // Modificadores de acesso
        // public - o atributo pode ser acessado ou executado a partir de qualquer outra classe
        // private - pode ser acessado, modificado ou executado apenas por metodos da mesma classe
        // protected - classes filhas ou derivadas tambem terao acesso ao atributo ou metodo
        // readonly - atributo somente de leitura, inicializados em sua declaracao ou no construtor

        // EXERCICIO 5

        Conta contaRai = new Conta(12345, "Raissa", 50);
        Conta contaTai = new Conta(14785, "Taina", 120);
        Conta contaLua = new Conta(25896, "Luana", 70);
        Pessoa cliente = new Pessoa("Raissa", "12345678962", "rua projetada", contaRai);
        Pessoa cliente2 = new Pessoa("Taina", "12883424462","rua das gaivotas", contaTai);
        Pessoa cliente3 = new Pessoa("Luana", "07591207490", "rua florida", contaLua);

        cliente.getConta().verInfor();
        cliente2.getConta().verInfor();
        cliente3.getConta().verInfor();

        // Saque Cliente
        boolean cliente1PodeSacar = cliente.getConta().sacar(80);

        if(cliente1PodeSacar){
            System.out.println("Saque realizado com sucesso!");
        }else {
            System.out.println("Saldo insuficiente!");
        }

        // Saque Cliente2 e tranferencia para cliente3
        boolean cliente2PodeSacar = cliente2.getConta().sacar(80);

        if(cliente2PodeSacar){
            System.out.println("Saque realizado com sucesso!");
            cliente3.getConta().transferir(80);
        }else {
            System.out.println("Saldo insuficiente!");
        }

        // Saque Cliente3
        boolean cliente3PodeSacar = cliente3.getConta().sacar(50);

        if(cliente2PodeSacar){
            System.out.println("Saque realizado com sucesso!");
        }else {
            System.out.println("Saldo insuficiente!");
        }

        System.out.printf("A cliente %s tem saldo %.2f\n", cliente.getNome(), cliente.getConta().getSaldo());
        System.out.printf("A cliente %s tem saldo %.2f\n", cliente2.getNome(), cliente2.getConta().getSaldo());
        System.out.printf("A cliente %s tem saldo %.2f\n", cliente3.getNome(), cliente3.getConta().getSaldo());
        System.out.println("\n");

        // EXERCICIO 9

        Corrente cc = new Corrente(28605, "Maria", -50);
        Poupanca cp = new Poupanca(11657, "Francisco", 600);

        Pessoa clientec = new Pessoa("Maria", "12345678962", "rua projetada", cc);
        Pessoa clientep = new Pessoa("Francisco", "12883424462","rua das gaivotas", cp);

        clientec.getConta().verInfor();
        clientep.getConta().verInfor();

        boolean clientecPodeSacar = clientec.getConta().sacar(20);

        if(clientecPodeSacar){
            System.out.println("Saque realizado com sucesso!");
        }else {
            System.out.println("Saldo insuficiente!");
        }

        System.out.println("Saldo final: " + clientec.getConta().getSaldo());

        // Segundo Saque
        clientecPodeSacar = clientec.getConta().sacar(50);

        if(clientecPodeSacar){
            System.out.println("Saque realizado com sucesso!");
        }else {
            System.out.println("Saldo insuficiente!");
        }

        System.out.println("Saldo final: " + clientec.getConta().getSaldo());

    }
}
