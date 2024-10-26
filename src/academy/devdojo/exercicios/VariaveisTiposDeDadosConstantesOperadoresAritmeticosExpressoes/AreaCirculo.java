package academy.devdojo.exercicios.VariaveisTiposDeDadosConstantesOperadoresAritmeticosExpressoes;

import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        double area = 0;
        double pi = 3.141592654;
        double raio;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor do raio.");
        raio = teclado.nextDouble();
        System.out.println("A área do círculo é " + pi* Math.pow(raio, 2));
    }
}
