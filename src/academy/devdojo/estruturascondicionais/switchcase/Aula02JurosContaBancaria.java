package academy.devdojo.estruturascondicionais.switchcase;

public class Aula02JurosContaBancaria {
    public static void main(String[] args) {
        String tipoDeConta = "CONTA_CORRENTE";
        switch (tipoDeConta) {
            case "CONTA_POUPANCA":
                System.out.println("Conta Poupança tem juros de 0.05%");
                break;
            case "CONTA_CORRENTE":
                System.out.println("Conta Corrente tem juros de 0.02%");
                break;
            case "CONTA_INVESTIMENTO":
                System.out.println("Conta Investimento tem juros de 0.1%");
                break;
            default:
                System.out.println("Conta Inexistente.");
        }
    }
}
