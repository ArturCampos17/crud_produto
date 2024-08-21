   <h1>CRUD de Produtos</h1>

    <h2>Visão Geral</h2>
    <p>O CRUD de Produtos é um sistema simples em Java que permite gerenciar uma lista de produtos. O sistema é projetado para realizar operações básicas de gerenciamento de dados: Criar, Ler, Atualizar e Excluir (CRUD) produtos em uma aplicação de console. Ele serve como uma base para entender a manipulação de dados em Java e pode ser expandido para aplicações mais complexas.</p>

    <h2>Funcionalidades</h2>
    <ul>
        <li>
            <h3>Adicionar Produto:</h3>
            <ul>
                <li>Permite ao usuário inserir um novo produto na lista.</li>
                <li>O sistema solicita o nome e o preço do produto.</li>
                <li>O produto é atribuído a um identificador único gerado automaticamente.</li>
            </ul>
        </li>
        <li>
            <h3>Listar Produtos:</h3>
            <ul>
                <li>Exibe todos os produtos armazenados na lista.</li>
                <li>Cada produto é apresentado com seus detalhes: ID, nome e preço.</li>
            </ul>
        </li>
        <li>
            <h3>Buscar Produto por ID:</h3>
            <ul>
                <li>Permite ao usuário buscar um produto específico usando seu ID.</li>
                <li>Se o produto com o ID fornecido existir, seus detalhes são exibidos; caso contrário, uma mensagem de erro é mostrada.</li>
            </ul>
        </li>
        <li>
            <h3>Atualizar Produto:</h3>
            <ul>
                <li>Permite modificar os detalhes de um produto existente.</li>
                <li>O usuário fornece o ID do produto a ser atualizado, junto com o novo nome e preço.</li>
            </ul>
        </li>
        <li>
            <h3>Remover Produto:</h3>
            <ul>
                <li>Remove um produto da lista com base no ID fornecido.</li>
                <li>Se o produto com o ID fornecido existir, ele é removido da lista; caso contrário, uma mensagem de erro é exibida.</li>
            </ul>
        </li>
    </ul>

    <h2>Estrutura do Projeto</h2>
    <p>O projeto está organizado da seguinte forma:</p>
    <ul>
        <li>
            <h3>Classe Produto:</h3>
            <ul>
                <li>Representa o modelo de dados do produto com atributos como ID, nome e preço.</li>
                <li>Inclui métodos para acessar e modificar esses atributos.</li>
            </ul>
        </li>
        <li>
            <h3>Classe ProdutoDAO:</h3>
            <ul>
                <li>Implementa o padrão Data Access Object (DAO) para gerenciar a lista de produtos.</li>
                <li>Contém métodos para adicionar, listar, buscar, atualizar e remover produtos.</li>
                <li>Utiliza uma lista interna para armazenar os produtos e um contador para gerar IDs únicos.</li>
            </ul>
        </li>
        <li>
            <h3>Classe Main:</h3>
            <ul>
                <li>Contém o método main, que serve como ponto de entrada da aplicação.</li>
                <li>Implementa a interface de linha de comando para interagir com o usuário.</li>
                <li>Oferece um menu de opções para executar as operações CRUD.</li>
            </ul>
        </li>
    </ul>

    <h2>Observações</h2>
    <ul>
        <li>Este projeto é uma aplicação de console e não inclui persistência de dados em banco de dados. Os dados são armazenados temporariamente em memória.</li>
        <li>Pode ser expandido para incluir persistência em banco de dados, uma interface gráfica, ou integração com APIs externas.</li>
        <li>O código é intencionalmente simples e serve como base para aprendizado e experimentação com o padrão CRUD em Java.</li>
    </ul>
