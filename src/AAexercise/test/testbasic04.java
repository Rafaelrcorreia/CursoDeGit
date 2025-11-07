package AAexercise.test;

import java.util.Scanner;

public class testbasic04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        for (int i = 0; i <= N; i += 2 ){
            System.out.println(i);
        }
    }
}
