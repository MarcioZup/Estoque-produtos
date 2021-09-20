package application;

import entities.Produto;

import java.util.HashMap;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        System.out.println("---Sistema de Estoque de Produtos---\n");
        Scanner teclado = new Scanner(System.in);
        Produto produto = new Produto();
        boolean loop = true;
        HashMap<String, String> listaProdutos = new HashMap<String, String>();


        while (loop == true){
            System.out.println("Escolha a opção desejada: ");
            System.out.println("1 - CADASTRAR");
            System.out.println("2 - ADICIONAR");
            System.out.println("3 - REMOVER");
            System.out.println("4 - SAIR");
            int opcao = 0;
            opcao = teclado.nextInt();
            teclado.nextLine();
            switch (opcao){
                case 1: {

                    System.out.println("Entre com o nome do produto: ");
                    produto.nome = teclado.nextLine();
                    System.out.println("Entre com o preço do produto: ");
                    produto.preco = teclado.nextDouble();
                    System.out.println("Entre com a quantidade de produtos: ");
                    produto.quantidade = teclado.nextInt();
                    listaProdutos.put(produto.nome, "Preço do produto: R$ " + produto.preco + " Quantidade: " + produto.quantidade);

                    System.out.println("Dados do produto: " + produto + "\n");
                    break;
                }
                case 2:{
                    System.out.println("Entre com o número de produtos que serão adicionados ao estoque: ");
                    int quantidade = teclado.nextInt();
                    produto.adicionaProduto(quantidade);

                    System.out.println("Dados atualizados: " + produto + "\n");
                    break;
                }
                case 3:{
                    System.out.println("Entre com o número de produtos a serem removidos do estoque: ");
                    int quantidadeRemover = teclado.nextInt();
                    produto.removeProdutos(quantidadeRemover);
                    System.out.println("Dados atualizados: " + produto);
                    break;
                }
                case 4:{
                    loop = false;
                    break;
                }
            }
        }







        teclado.close();
    }
}
