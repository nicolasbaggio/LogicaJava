package academy.devdojo.exercicios.VariaveisTiposDeDadosConstantesOperadoresAritmeticosExpressoes;

import java.util.Scanner;

public class ConversaoCelsiusFahrenheit {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float celsius;
        System.out.println("Digite a temporatura em graus Celsius.");
        celsius = teclado.nextFloat();
        float fahrenheit;
        fahrenheit = (celsius * 1.8F + 32F);
        System.out.println("A temperatura em Fahrenheit é de: " + fahrenheit + "F");
    }
}
