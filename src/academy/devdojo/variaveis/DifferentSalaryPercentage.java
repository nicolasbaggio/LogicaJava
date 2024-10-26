package academy.devdojo.variaveis;

public class DifferentSalaryPercentage {
    public static void main(String[] args) {
        float salary = 2000.00F;
        float percentage1 = 0.3F;
        float percentage2 = 0.15F;
        float percentage3 = 0.05F;
        float salaryPercentage = salary * percentage1;
        System.out.println("30% of Salary = " + salaryPercentage);
        salaryPercentage = salary * percentage2;
        System.out.println("15% of Salary = " + salaryPercentage);
        salaryPercentage = salary * percentage3;
        System.out.println("5% of Salary = " + salaryPercentage);
    }
}
