# Descrição do CRUD de Produtos

## Visão Geral

O CRUD de Produtos é um sistema simples em Java que permite gerenciar uma lista de produtos. O sistema é projetado para realizar operações básicas de gerenciamento de dados: Criar, Ler, Atualizar e Excluir (CRUD) produtos em uma aplicação de console. Ele serve como uma base para entender a manipulação de dados em Java e pode ser expandido para aplicações mais complexas.

## Funcionalidades

- **Adicionar Produto:**
  - Permite ao usuário inserir um novo produto na lista.
  - O sistema solicita o nome e o preço do produto.
  - O produto é atribuído a um identificador único gerado automaticamente.

- **Listar Produtos:**
  - Exibe todos os produtos armazenados na lista.
  - Cada produto é apresentado com seus detalhes: ID, nome e preço.

- **Buscar Produto por ID:**
  - Permite ao usuário buscar um produto específico usando seu ID.
  - Se o produto com o ID fornecido existir, seus detalhes são exibidos; caso contrário, uma mensagem de erro é mostrada.

- **Atualizar Produto:**
  - Permite modificar os detalhes de um produto existente.
  - O usuário fornece o ID do produto a ser atualizado, junto com o novo nome e preço.

- **Remover Produto:**
  - Remove um produto da lista com base no ID fornecido.
  - Se o produto com o ID fornecido existir, ele é removido da lista; caso contrário, uma mensagem de erro é exibida.

## Estrutura do Projeto

O projeto está organizado da seguinte forma:

- **Classe Produto:**
  - Representa o modelo de dados do produto com atributos como ID, nome e preço.
  - Inclui métodos para acessar e modificar esses atributos.

- **Classe ProdutoDAO:**
  - Implementa o padrão Data Access Object (DAO) para gerenciar a lista de produtos.
  - Contém métodos para adicionar, listar, buscar, atualizar e remover produtos.
  - Utiliza uma lista interna para armazenar os produtos e um contador para gerar IDs únicos.

- **Classe Main:**
  - Contém o método main, que serve como ponto de entrada da aplicação.
  - Implementa a interface de linha de comando para interagir com o usuário.
  - Oferece um menu de opções para executar as operações CRUD.

## Observações

- Este projeto é uma aplicação de console e não inclui persistência de dados em banco de dados. Os dados são armazenados temporariamente em memória.
- Pode ser expandido para incluir persistência em banco de dados, uma interface gráfica, ou integração com APIs externas.
- O código é intencionalmente simples e serve como base para aprendizado e experimentação com o padrão CRUD em Java.
