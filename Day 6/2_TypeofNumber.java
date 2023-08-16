import java.util.Scanner;

class TypeofNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number : ");
        float num = scan.nextFloat();

        if (num >= 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is negative");
        }

        scan.close();
    }
}
