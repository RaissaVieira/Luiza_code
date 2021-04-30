package com.company;

public class Main {

    public static void main(String[] args) {
	    // HERANCA
        // objetos herdam atributos e metodos de outras classes

        Funcionario lavinia = new Funcionario();
        Gerente bea = new Gerente();

        lavinia.setNome("Lavinia");
        lavinia.setCpf("12345678962");
        lavinia.setSalario(10000);
        lavinia.setSenha(123456);

        if(lavinia.autenticar(123456)){
            lavinia.verInformacoes();
        }

        bea.setNome("Bea");
        bea.setCpf("14785236987");
        bea.setSalario(20000);
        bea.setSenha(123456);
        bea.setNumFuncionariosGerenciados(20);

        if(lavinia.autenticar(123456)){
            bea.verInformacoes();
        }
    }
}
