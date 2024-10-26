package academy.devdojo.estruturascondicionais.ifselse;

public class ImpostoDeRenda {
    public static void main(String[] args) {
        double salario = 2350;
        double resultado = 0;
        String imposto = "";
        if (salario <= 2259.20) {
            resultado = salario * 0;
            imposto = "0%";
        } else if (salario > 2259.20 && salario <= 2826.65) {
            resultado = salario * 0.075;
            imposto = "7.5%";
        } else if (salario > 2826.65 && salario <= 3751.05) {
            resultado = salario * 0.15;
            imposto = "15%";
        } else if (salario > 3751.05 && salario <= 4664.68) {
            resultado = salario * 0.225;
            imposto = "22.5%";
        } else if (salario >= 4664.68) {
            resultado = salario * 0.275;
            imposto = "27.5%";
        }
        System.out.println("O imposto de renda é de " + imposto + " = " + resultado);
    }
}
