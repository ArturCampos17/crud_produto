package com.meucrud;

import java.util.Scanner;
import com.meucrud.dao.ProdutoDAO;
import com.meucrud.model.Produto;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProdutoDAO produtoDAO = new ProdutoDAO();
        int opcao = 0;

        do {
            System.out.println("----- CRUD de Produtos -----");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Listar Produtos");
            System.out.println("3. Buscar Produto por ID");
            System.out.println("4. Atualizar Produto");
            System.out.println("5. Remover Produto");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do Produto: ");
                    String nome = scanner.next();
                    System.out.print("Preço do Produto: ");
                    double preco = scanner.nextDouble();
                    produtoDAO.adicionarProduto(nome, preco);
                    System.out.println("Produto adicionado com sucesso!");
                    break;
                case 2:
                    System.out.println("Lista de Produtos:");
                    for (Produto p : produtoDAO.listarProdutos()) {
                        System.out.println(p);
                    }
                    break;
                case 3:
                    System.out.print("ID do Produto: ");
                    int idBusca = scanner.nextInt();
                    Produto produto = produtoDAO.buscarProdutoPorId(idBusca);
                    if (produto != null) {
                        System.out.println(produto);
                    } else {
                        System.out.println("Produto não encontrado!");
                    }
                    break;
                case 4:
                    System.out.print("ID do Produto a ser atualizado: ");
                    int idAtualizar = scanner.nextInt();
                    System.out.print("Novo nome do Produto: ");
                    String novoNome = scanner.next();
                    System.out.print("Novo preço do Produto: ");
                    double novoPreco = scanner.nextDouble();
                    if (produtoDAO.atualizarProduto(idAtualizar, novoNome, novoPreco)) {
                        System.out.println("Produto atualizado com sucesso!");
                    } else {
                        System.out.println("Produto não encontrado!");
                    }
                    break;
                case 5:
                    System.out.print("ID do Produto a ser removido: ");
                    int idRemover = scanner.nextInt();
                    if (produtoDAO.removerProduto(idRemover)) {
                        System.out.println("Produto removido com sucesso!");
                    } else {
                        System.out.println("Produto não encontrado!");
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
            System.out.println();
        } while (opcao != 0);

        scanner.close();
    }
}
