package QString.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
    String nome = "Rafael";
    nome = nome.concat(" Oliveira");
    nome = nome.replace("R", "L");
        System.out.println(nome);
    StringBuilder sb = new StringBuilder("Rafael");
    sb.append(" Correia").append(" Oliveira");
        System.out.println(sb);
    }
}
