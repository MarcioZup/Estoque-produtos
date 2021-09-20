package application;

import entities.Produto;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Produto produto = new Produto();

        System.out.println("Entre com o nome do produto: ");
        produto.nome = teclado.nextLine();
        System.out.println("Entre com o preço do produto: ");
        produto.preco = teclado.nextDouble();
        System.out.println("Entre com a quantidade de produtos: ");
        produto.quantidade = teclado.nextInt();

        System.out.println("Dados do produto: " + produto);

        System.out.println("Entre com o número de produtos que serão adicionados ao estoque: ");
        int quantidade = teclado.nextInt();
        produto.adicionaProduto(quantidade);

        System.out.println("Dados atualizados: " + produto);

        System.out.println("Entre com o número de produtos a serem removidos do estoque: ");
        int quantidadeRemover = teclado.nextInt();
        produto.removeProdutos(quantidadeRemover);
        System.out.println("Dados atualizados: " + produto);

        teclado.close();
    }
}
