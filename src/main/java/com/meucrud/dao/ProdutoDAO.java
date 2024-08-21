package com.meucrud.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import com.meucrud.model.Produto;

public class ProdutoDAO {
    private List<Produto> produtos = new ArrayList<>();
    private int contadorId = 1;

    // Create
    public void adicionarProduto(String nome, double preco) {
        Produto produto = new Produto(contadorId++, nome, preco);
        produtos.add(produto);
    }

    // Read
    public List<Produto> listarProdutos() {
        return produtos;
    }

    public Produto buscarProdutoPorId(int id) {
        Optional<Produto> produto = produtos.stream().filter(p -> p.getId() == id).findFirst();
        return produto.orElse(null);
    }

    // Update
    public boolean atualizarProduto(int id, String nome, double preco) {
        Produto produto = buscarProdutoPorId(id);
        if (produto != null) {
            produto.setNome(nome);
            produto.setPreco(preco);
            return true;
        }
        return false;
    }

    // Delete
    public boolean removerProduto(int id) {
        return produtos.removeIf(p -> p.getId() == id);
    }
}
