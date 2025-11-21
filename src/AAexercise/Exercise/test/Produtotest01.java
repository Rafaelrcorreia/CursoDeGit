package AAexercise.Exercise.test;

import AAexercise.Exercise.domain.Produto;

public class Produtotest01 {
    public static void main(String[] args) {
        Produto mouse = new Produto("Mouse Gamer", 120.0, 10);

        System.out.println("Nome do produto: " + mouse.getNome() + ", R$" + mouse.getPreco() + ", " + mouse.getQuantidade());
        mouse.totalValorEmEstoque();
        System.out.println("Valor total em estoque: R$" + mouse.totalValorEmEstoque());
        mouse.adicionarProdutos(5);
        System.out.println("Atualização de estoque após adição: " + mouse.getQuantidade());
        mouse.removerProdutos(3);
        System.out.println("Atualização de estoque após remoção: " + mouse.getQuantidade());

    }
}
