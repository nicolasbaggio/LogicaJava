package academy.devdojo.variaveis;

public class SalaryPercentageCalculator {
    public static void main(String[] args){
        float salary = 2000.75F;
        float percentage = 0.3F;
        float salaryPercentage = salary*percentage;
        System.out.printf("Salary Percentage = %.3f %n", salaryPercentage);
    }
}
