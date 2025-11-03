package Exercise.domain;

public class Produtos {
    public String nome;
    public double preco;
    public int[] vendaspormes;

    public void imprimirInfos(){
        System.out.println("--------------------");
        System.out.println(this.nome);
        System.out.printf("%.2f\n",this.preco);
        if (vendaspormes == null || vendaspormes.length == 0){
            vendaspormes = new int[] {0};
        }
        for (int vendas: vendaspormes){
            System.out.println("Quantidade de vendas mensal: " + vendas);
        }
    }

    public void mediamensal(){

        int soma = 0;
        for (int vendas : vendaspormes){
            soma+=vendas;
        }
        double media = soma/vendaspormes.length;
        System.out.println("Média de vendas mensais: " + media);
    }

    public void lucropormes(){
        for(int vendas : vendaspormes){
            double lucro = preco * vendas;
            System.out.printf("Lucro do mês: %.2f\n", lucro);
        }

    }
    public void maiorVendaPorMes(){
        int maior = 0;
        for(int vendas: vendaspormes){
            if (vendas > maior){
                maior -= maior;
                maior += vendas;
            }
        }
                System.out.println("Maior venda por mês: " + maior);
    }
}
