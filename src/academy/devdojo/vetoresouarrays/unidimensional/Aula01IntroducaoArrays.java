package academy.devdojo.vetoresouarrays.unidimensional;

public class Aula01IntroducaoArrays {
    public static void main(String[] args) {
        double[] notas = new double[4];
        notas[0] = 7.5;
        notas[1] = 8.0;
        notas[2] = 3.0;
        notas[3] = 6.0;
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }
    }
}
