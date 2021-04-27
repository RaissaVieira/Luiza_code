package com.company;

public class Carro {

    // Atributos
    String tipo;
    String Cor;
    String placa;
    int numeroDePortas;
    Pessoa dono;

    // Construtor
    public Carro(String tipo, String cor, String placa, int numeroDePortas) {
        this.tipo = tipo;
        Cor = cor;
        this.placa = placa;
        this.numeroDePortas = numeroDePortas;
    }

    // Metodos
    void Ligar(){
        System.out.println("CARRO LIGADO");
    }

    void Desligar(){
        System.out.println("CARRO DESLIGADO");
    }

    int dobroPortas(){
        return numeroDePortas*2;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String cor) {
        Cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    public Pessoa getDono() {
        return dono;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
    }
}
