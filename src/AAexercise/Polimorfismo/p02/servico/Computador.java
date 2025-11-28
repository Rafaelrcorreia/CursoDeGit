package AAexercise.Polimorfismo.p02.servico;

import AAexercise.Polimorfismo.p01.domain.Animal;
import AAexercise.Polimorfismo.p02.domain.Produto;

public class Computador extends Produto {

    @Override
    public void exibirInfo() {
        System.out.println("Exibindo informações do computador.");
    }

}
