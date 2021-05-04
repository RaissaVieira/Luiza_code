package com.company;

public class Corrente extends Conta{
    private static final int LIMITE = 100;

    public Corrente(int numero, String dono, double saldo) {
        super(numero, dono, saldo);
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= super.getSaldo() + LIMITE) {
            super.setSaldo(super.getSaldo() - valor);
            return true;
        }
        return false;
    }
}
