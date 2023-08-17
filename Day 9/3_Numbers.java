import java.util.Scanner;

class Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int num1 = scan.nextInt();

        System.out.print("Enter second number : ");
        int num2 = scan.nextInt();

        System.out.print("Enter third number : ");
        int num3 = scan.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("First number is greater among three numbers");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Second number is greater among three numbers");
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("Third number is greater among three numbers");
        } else if (num1 == num2 && num1 > num3) {
            System.out.println("First and second numbers are equal and are greater than third number");
        } else if (num1 == num3 && num1 > num2) {
            System.out.println("First and third numbers are equal and are greater than second number");
        } else {
            System.out.println("Second and third numbers are equal and are greater than first number");
        }

        scan.close();
    }
}
