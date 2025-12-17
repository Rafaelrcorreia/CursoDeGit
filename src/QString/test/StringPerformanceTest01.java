package QString.test;

public class StringPerformanceTest01 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(1000);

        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para concatenar String: " + (fim - inicio) + " ms");

        String nome = "Maratona Java";
        System.out.println(nome.substring(8));            // "Java"
    }
    private static void concatString(int size){
        StringBuilder sb = new StringBuilder(size);
        for (int i = 0; i < size; i++) {
            sb.append(i);
            System.out.println(sb.toString());
        }
    }
}
