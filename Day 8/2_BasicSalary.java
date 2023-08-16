import java.util.Scanner;

class BasicSalary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter CTC : ");
        int costToCompany = scan.nextInt();

        System.out.print("Enter TA : ");
        float totalAllowance = scan.nextFloat();

        System.out.print("Enter DA : ");
        float dearnessAllowance = scan.nextFloat();

        System.out.print("Enter HRA : ");
        float houseRentAllowance = scan.nextFloat();

        double basicSalary = (costToCompany - totalAllowance)
                / (1 + (dearnessAllowance / 100) + (houseRentAllowance / 100));

        System.out.println("Basic salary : " + basicSalary);
        scan.close();
    }
}
