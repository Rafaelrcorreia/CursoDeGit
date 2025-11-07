package AAexercise.test;

import java.util.Scanner;

public class testbasic03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        while (num <= 100) {
            System.out.println(num);
            int num2 = sc.nextInt();
            num += num2;


        }
        System.out.println(num);
        sc.close();
    }
}
