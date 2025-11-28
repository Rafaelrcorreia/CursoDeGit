package AAexercise.Polimorfismo.p04;

import AAexercise.Polimorfismo.p04.domain.Midia;
import AAexercise.Polimorfismo.p04.servico.BlueRay;
import AAexercise.Polimorfismo.p04.servico.Cd;
import AAexercise.Polimorfismo.p04.servico.Dvd;

import java.util.ArrayList;

public class test01 {
    public static void main(String[] args) {
        ArrayList<Midia> midias = new ArrayList<>();
        midias.add(new Cd("Linkin Park", 12));
        midias.add(new Cd("Metallica", 10));
        midias.add(new Dvd("Madonna", 15));
        midias.add(new BlueRay("Adele", 11, "4K"));

        midias.getFirst().inserirDados(1, "Hybrid Theory", 99.90);
        midias.get(1).inserirDados(2, "Black Album", 89.90);
        midias.get(2).inserirDados(3, "The Immaculate Collection", 79.90);
        midias.get(3).inserirDados(4, "FiftyCent", 119.90);

        for (Midia midia : midias) {
            midia.printDados();
            System.out.println("-----");
        }
    }
}
