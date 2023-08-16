import java.util.Scanner;

class CTC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the basic salary : ");
        int basicSalary = scan.nextInt();

        System.out.print("Enter the total allowance : ");
        int totalAllowance = scan.nextInt();

        System.out.print("Enter the da : ");
        float dearnessAllowance = scan.nextInt();

        System.out.print("Enter the hra : ");
        float houseRentAllowance = scan.nextInt();

        float costToCompany = basicSalary + totalAllowance + (basicSalary * (dearnessAllowance / 100))
                + (basicSalary * (houseRentAllowance / 100));

        System.out.println("CTC : " + costToCompany);

        scan.close();

    }
}