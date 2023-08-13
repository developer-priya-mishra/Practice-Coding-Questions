import java.util.Scanner;

class CTC{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.print("Enter the basic salary : ");
        int basic_salary= scan.nextInt();

        System.out.print("Enter the total allowance : ");
        int ta= scan.nextInt();

        System.out.print("Enter the da : ");
        float da= scan.nextInt();

        System.out.print("Enter the hra : ");
        float hra= scan.nextInt();

        float ctc= basic_salary + ta + (basic_salary*(da/100)) + (basic_salary*(hra/100));
        System.out.println("CTC : "+ctc);

        scan.close();

    }
}