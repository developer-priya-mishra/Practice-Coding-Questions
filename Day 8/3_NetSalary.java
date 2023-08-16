import java.util.Scanner;

class NetSalary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the basic salary  : ");
        int basicSalary = scan.nextInt();

        double dearnessAllowance = (25.0 / 100) * basicSalary;

        double houseRentAllowance = (15.0 / 100) * basicSalary;

        double grossSalary = basicSalary + dearnessAllowance + houseRentAllowance;

        double providentFund = (10.0 / 100) * grossSalary;

        double netSalary = grossSalary - providentFund;

        System.out.println("Net Salary : " + netSalary);

        scan.close();
    }
}
