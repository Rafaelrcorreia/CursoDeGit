package Lclassesabstratas.test;

import Lclassesabstratas.domain.Desenvolvedor;
import Lclassesabstratas.domain.Gerente;

public class Funcionariotest01 {
    // Testando classes abstratas
  // Não é possível instanciar a classe Funcionario diretamente
    // Funcionario func = new Funcionario("Ana", 5000.0); // Isso causará um erro de compilação
    // Em vez disso, instanciamos as subclasses
    // Gerente e Desenvolvedor

    public static void main(String[] args) {
        Gerente gerente = new Gerente("Maria", 3500.0);
        Desenvolvedor desenvolvedor = new Desenvolvedor("João", 12000.0);

        gerente.imprime();
        System.out.println(gerente);
        desenvolvedor.imprime();
        System.out.println(desenvolvedor);
    }
}
