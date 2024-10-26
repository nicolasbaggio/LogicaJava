package academy.devdojo.estruturascondicionais.ifselse;

import java.util.Scanner;

//Receba um número inteiro do usuário e imprima o dia da semana correspondente
//Sendo 1 segunda-feira
public class DiasDaSemana {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 7, sendo 1 segunda-feira e 7 domingo.");
        int diaDaSemana = teclado.nextInt();
        if (diaDaSemana == 1) {
            System.out.println("Segunda-feira");
        } else if (diaDaSemana == 2) {
            System.out.println("Terça-feira");
        } else if (diaDaSemana == 3) {
            System.out.println("Quarta-feira");
        } else if (diaDaSemana == 4) {
            System.out.println("Quinta-feira");
        } else if (diaDaSemana == 5) {
            System.out.println("Sexta-feira");
        } else if (diaDaSemana == 6) {
            System.out.println("Sábado");
        } else if (diaDaSemana == 7) {
            System.out.println("Domingo");
        } else {
            System.out.println("Insira um número válido.");
        }
    }
}
