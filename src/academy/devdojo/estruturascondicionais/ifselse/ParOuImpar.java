package academy.devdojo.estruturascondicionais.ifselse;

public class ParOuImpar {
    public static void main(String[] args) {
        int numero = 3;
        if(numero % 2 == 0){
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }
    }
}
