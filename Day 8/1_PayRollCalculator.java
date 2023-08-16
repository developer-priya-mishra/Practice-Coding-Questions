import java.util.Scanner;

class PayRollCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter hours worked: ");
        float hoursWorked = scanner.nextFloat();

        System.out.print("Enter hourly rate: ");
        float hourlyRate = scanner.nextFloat();

        System.out.print("Enter allowances: ");
        float allowances = scanner.nextFloat();

        System.out.print("Enter tax rate (%): ");
        float taxRate = scanner.nextFloat();

        System.out.print("Enter other deductions: ");
        float otherDeductions = scanner.nextFloat();

        float grossSalary = (hoursWorked * hourlyRate) + allowances;

        float taxableIncome = grossSalary - otherDeductions;

        float taxAmount = (taxableIncome * taxRate) / 100;

        float netSalary = grossSalary - (taxAmount + otherDeductions);

        System.out.println("\nPayroll Details for " + name);
        System.out.println("Gross Salary : " + grossSalary);
        System.out.println("Tax Amount : " + taxAmount);
        System.out.println("Other Deductions : " + otherDeductions);
        System.out.println("Net Salary : " + netSalary);

        scanner.close();
    }
}
