package Exercise.test;

import Exercise.domain.Produtos;

public class produtostest {
    public static void main(String[] args) {
        Produtos produto = new Produtos();
        produto.nome = "Notebook Gamer";
        produto.preco = 7500.00;
        produto.vendaspormes = new int[] {30, 10, 50, 90};

        produto.imprimirInfos();
        System.out.println("--------------------");
        produto.mediamensal();
        System.out.println("--------------------");
        produto.lucropormes();
        System.out.println("--------------------");
        produto.maiorVendaPorMes();
    }
}
