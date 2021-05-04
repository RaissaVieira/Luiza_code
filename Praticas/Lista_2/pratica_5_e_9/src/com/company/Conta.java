package com.company;

public class Conta {
    private int numero;
    private String dono;
    private double saldo;
    private static int totalDeContas = 0;

    public Conta(){}

    public Conta(int numero, String dono, double saldo) {
        this.numero = numero;
        this.dono = dono;
        this.saldo = saldo;
        totalDeContas += 1;
    }

    public void verInfor() {
        System.out.println("Informacoes da conta");
        System.out.println("Numero: " + this.numero);
        System.out.println("Dono: " + this.dono);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("----------------------\n");
    }

    public boolean sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo = saldo - valor;
            return true;
        }
        return false;
    }

    public void transferir(double valor){
        this.saldo = saldo + valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getTotalDeContas() {
        return Conta.totalDeContas;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
