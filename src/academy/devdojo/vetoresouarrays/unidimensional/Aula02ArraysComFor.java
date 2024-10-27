package academy.devdojo.vetoresouarrays.unidimensional;

import java.util.Scanner;

public class Aula02ArraysComFor {
    public static void main(String[] args) {
        double[] notas = new double[4];
        Scanner scanner = new Scanner(System.in);
        double media = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota " + (i + 1));
            notas[i] = scanner.nextDouble();
            System.out.println(notas[i]);
            media = media + notas[i];
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }
        System.out.println("Média das notas: " + (media/notas.length));
    }
}
