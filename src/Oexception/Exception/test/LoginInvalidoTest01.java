package Oexception.Exception.test;

import Oexception.Exception.domain.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoTest01 {
    public static void main(String[] args) {
        try {
            Logar();
        } catch (LoginInvalidoException e) {
        System.out.println(e.getMessage());
        }

    }
    private static void Logar() throws LoginInvalidoException{
        Scanner teclado = new Scanner(System.in);
        String usernameDB = "admin";
        String senhaDB = "Senha123";
        System.out.print("Digite o usuário: ");
        String usernameDigitado = teclado.nextLine();
        System.out.print("Digite a senha: ");
        String senhaDigitada = teclado.nextLine();
        if(!usernameDB.equals(usernameDigitado) || !senhaDigitada.equals(senhaDB)){
            throw new LoginInvalidoException("Usuário ou senha inválidos!");
        }
        System.out.println("Login realizado com sucesso!");



    }
}
