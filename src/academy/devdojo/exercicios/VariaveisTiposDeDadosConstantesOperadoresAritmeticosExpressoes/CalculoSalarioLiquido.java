package academy.devdojo.exercicios.VariaveisTiposDeDadosConstantesOperadoresAritmeticosExpressoes;

public class CalculoSalarioLiquido {
    public static void main(String[] args) {
        float salarioBase;
        float horasTrabalhadas = 160F;
        float valorHora = 15.72F;
        salarioBase = horasTrabalhadas * valorHora;
        float descontos;
        float percentualDesconto = 10F;
        descontos = salarioBase * (percentualDesconto / 100);
        float salarioLiquido;
        salarioLiquido = salarioBase - descontos;
        System.out.println("Seu salário base é de: " + salarioBase);
        System.out.println("Seu salário líquido é de: " + salarioLiquido);
    }
}
