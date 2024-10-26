package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula04Login {
    public static void main(String[] args) {
        final String login = "Luffy";
        final String password = "ReiDosPiratas";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Digite seu login");
            String loginDigitado = scanner.nextLine();
            System.out.println("Digite sua senha");
            String passwordDigitado = scanner.nextLine();
            if (login.equals(loginDigitado) && password.equals(passwordDigitado)) {
                System.out.println("ACESSO CONCEDIDO.");
                break;
            }
            System.out.println("ACESSO NEGADO");
        }
        System.out.println("PROGRAMA TERMINADO");
    }
}
