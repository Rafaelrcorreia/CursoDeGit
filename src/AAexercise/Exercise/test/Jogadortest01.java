package AAexercise.Exercise.test;

import AAexercise.Exercise.domain.Jogador;

public class Jogadortest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Carlos");
        Jogador jogador2 = new Jogador("Ana");
        Jogador jogador3 = new Jogador("Pedro");
        Jogador[] jogadores = {jogador1, jogador2, jogador3};
        for (Jogador jogador: jogadores){
            jogador.adicionarPontos(50);
        }




    }
}
