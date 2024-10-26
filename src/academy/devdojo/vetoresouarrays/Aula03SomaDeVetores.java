package academy.devdojo.vetoresouarrays;

public class Aula03SomaDeVetores {
    public static void main(String[] args) {
        int[] vetor1 = {1,2,3,4,5,6,7,8,9};
        int[] vetor2 = {2,3,4,5,6,7,8,9,0};
        int[] vetorProduto = new int[9];
        for (int i = 0; i < 9; i++) {
            vetorProduto[i] = vetor1[i] * vetor2[i];
            System.out.println(vetorProduto[i] + " ");
        }
    }
}
