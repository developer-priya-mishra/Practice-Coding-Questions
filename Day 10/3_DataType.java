import java.util.Scanner;

class DataType {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number : ");

        if (scan.hasNextInt()) {
            int num1 = scan.nextInt();
            System.out.println(num1 + " is an Integer");
        } else if (scan.hasNextFloat()) {
            float num2 = scan.nextFloat();
            System.out.println(num2 + " is float");
        } else if (scan.hasNextDouble()) {
            double num3 = scan.nextDouble();
            System.out.println(num3 + " is double ");
        } else {
            System.out.println("Number is invalid");
        }

        scan.close();
    }
}
