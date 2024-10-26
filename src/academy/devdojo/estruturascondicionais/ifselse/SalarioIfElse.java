package academy.devdojo.estruturascondicionais.ifselse;

public class SalarioIfElse {
    public static void main(String[] args) {
        float salary = 4600F;
        float result;
        String percentage = "";
        if (salary > 4500) {
            result = salary * 0.3F;
            percentage = "30%";
        } else {
            result = salary * 0.15F;
            percentage = "15%";
        }
        System.out.println("The percentage value of " + percentage + " is " + result);
    }
}
