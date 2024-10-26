package academy.devdojo.exercicios.VariaveisTiposDeDadosConstantesOperadoresAritmeticosExpressoes;

import java.util.Scanner;

public class VolumeLataOleo {
    public static void main(String[] args) {
        double volume;
        double pi = 3.141592654;
        double raio = 0;
        double altura = 3;
        System.out.println("Digite o valor do raio em centímetros.");
        Scanner teclado = new Scanner(System.in);
        raio = teclado.nextDouble();
        volume = pi * Math.pow(raio, 2) * altura;
        System.out.println("O volume é de: " + volume);
    }
}
