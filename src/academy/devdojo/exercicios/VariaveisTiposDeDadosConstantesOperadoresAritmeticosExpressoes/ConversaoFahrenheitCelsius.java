package academy.devdojo.exercicios.VariaveisTiposDeDadosConstantesOperadoresAritmeticosExpressoes;

import java.util.Scanner;

public class ConversaoFahrenheitCelsius {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double fahrenheit;
        System.out.println("Digite a temporatura em graus Fahrenheit.");
        fahrenheit = teclado.nextDouble();
        double celsius;
        celsius = ((fahrenheit - 32) * 5 )/ 9;
        System.out.println("A temperatura em Celsius é de: " + celsius + "C");
    }
}
