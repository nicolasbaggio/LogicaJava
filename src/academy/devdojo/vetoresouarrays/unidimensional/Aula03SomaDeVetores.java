package academy.devdojo.vetoresouarrays.unidimensional;

public class Aula03SomaDeVetores {
    public static void main(String[] args) {
        int[] vetor1 = {1,2,3,4,5,6,7,8,9};
        int[] vetor2 = {2,3,4,5,6,7,8,9,0};
        int[] vetor3 = new int[9];
        String vetorProduto = "";
        for (int i = 0; i < 9; i++) {
            vetor3[i] = vetor1[i] * vetor2[i];
            vetorProduto += vetor3[i] + " ";
        }
        System.out.println(vetorProduto);
    }
}
