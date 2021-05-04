package com.company;

public class Compra {
    Pessoa pessoa;
    Produto produto;

    void comprar(Pessoa pessoa, Produto produto) {
        System.out.printf("%s comprou %s", pessoa.consultaNome(), produto.consultaNome());
        setProduto(produto);
        setPessoa(pessoa);
    }

    public String verficarCompra(){
        if(produto == null){
            return "nenhum item selecionado";
        }
        return produto.consultaNome();
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
