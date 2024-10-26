package academy.devdojo.estruturascondicionais.ifselse;

import java.util.Scanner;

public class AlistamentoMilitar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        int idade = teclado.nextInt();
        System.out.println("Qual o seu sexo? (Digite M para masculino e F para feminino.) ");
        String sexo = teclado.next();
        if (sexo.equals("M") & idade >= 18) {
            System.out.println("Alistamento obrigatório.");
        } else if ((sexo.equals("M") || sexo.equals("F")) & idade < 18) {
            System.out.println("Alistamento não permitido.");
        } else if (sexo.equals("F") & idade >= 18) {
            System.out.println("Deseja se alistar?");
        } else {
            System.out.println("Erro, por favor digite apenas M ou F.");
        }

    }
}
