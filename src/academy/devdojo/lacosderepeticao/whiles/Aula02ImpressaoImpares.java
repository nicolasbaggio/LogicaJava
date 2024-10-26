package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula02ImpressaoImpares {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor desejado");
        int numeroFinal = teclado.nextInt();
        int i = 0;
        while (i <= numeroFinal) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i = i + 1;
        }
    }
}
