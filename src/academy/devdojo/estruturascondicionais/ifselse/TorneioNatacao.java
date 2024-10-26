package academy.devdojo.estruturascondicionais.ifselse;

import java.util.Scanner;

public class TorneioNatacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = input.next();
        System.out.println("Digite a sua idade: ");
        int idadeNome = input.nextInt();
        if(idadeNome <= 10){
            System.out.println(nome + " participará da categoria Infantil.");
        } else if(idadeNome > 10 && idadeNome <= 15){
            System.out.println(nome + " participará da categoria Juvenil.");
        } else if(idadeNome > 15 && idadeNome <= 19){
            System.out.println(nome + " participará da categoria Pré-adulto.");
        } else if(idadeNome > 19){
            System.out.println(nome + " participará da categoria academy.devdojo.estruturascondicionais.ifselse.Adulto.");
        }
    }
}
