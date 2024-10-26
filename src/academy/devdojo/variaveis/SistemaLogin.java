package academy.devdojo.variaveis;

import java.util.Scanner;

public class SistemaLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o seu usuário: ");
        String usuario = input.next();
        if (usuario.equals("") || usuario == null || usuario.equalsIgnoreCase("admin") || usuario.equalsIgnoreCase("administrador")) {            System.out.println("Usuário inválido.");
        } else {
            System.out.println(usuario + " cadastrado com sucesso");
        }
    }
}