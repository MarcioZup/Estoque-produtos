package entities;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;


    public double valorTotalEmEstoque(){
        return quantidade * preco;
    }
    public void adicionaProduto(int quantidade){
        this.quantidade += quantidade;
    }

    public void removeProdutos(int quantidade){
        this.quantidade = this.quantidade - quantidade;

    }

    public String toString(){
        return nome
                + ", R$ "
                + preco
                + ", "
                + quantidade
                + " unidades, Total: R$ "
                + valorTotalEmEstoque();


    }
}
