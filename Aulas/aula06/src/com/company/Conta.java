package com.company;

public class Conta {
    private int numero;
    private String dono;
    private double saldo;
    private static int totalDeContas = 0;

    public Conta(int numero, String dono, double saldo) {
        this.numero = numero;
        this.dono = dono;
        this.saldo = saldo;
        totalDeContas += 1;
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

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getTotalDeContas() {
        return Conta.totalDeContas;
    }
}
