package AAAexerciseInterface.domain;

    public class Moto implements Veiculo {
        private String nome = "moto";

        public void velocidadeMaxima(){
            System.out.println("A velocidade máxima da moto é: " + VELOCIDADE_MAXIMA + " km/h");
        }

        @Override
        public void acelerar() {
            System.out.println("A moto está acelerando");
        }

        @Override
        public void frear() {
            System.out.println("A moto está freando");

        }

        @Override
        public void buzinar() {
            System.out.println("A moto está buzinando: Pi Pi Pi!");
        }

        public String getNome() {
            return "Moto";
        }
    }
