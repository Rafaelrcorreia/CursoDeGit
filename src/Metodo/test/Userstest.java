package Metodo.test;

import Metodo.domain.Users;
import java.util.Scanner;

public class Userstest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Users Usuario1 = new Users();
        System.out.println("Digite seu nome de usuário: ");
        String nomeusuario = scanner.next();
        System.out.println("Digite sua idade: ");
        int idadeusuario = scanner.nextInt();
        Usuario1.CriarUsuario(nomeusuario, idadeusuario);
        System.out.println("Usuário: " + nomeusuario +"\n" + "Idade: "+ idadeusuario);
        scanner.close();

    }
}
