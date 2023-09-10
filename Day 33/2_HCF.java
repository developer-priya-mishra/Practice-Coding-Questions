import java.util.Scanner;

// HCF or LCM of two numbers is the highest factor that can divide the two numbers.
// Using the Euclidean algorithm.
class HCF {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int num1 = scan.nextInt();

        System.out.print("Enter the second number : ");
        int num2 = scan.nextInt();

        int dividend = Math.max(num1, num2);
        int divisor = Math.min(num1, num2);
        int remainder = (int) (dividend % divisor);
        while (remainder != 0) {
            dividend = divisor;
            divisor = remainder;
            remainder = dividend % divisor;
        }

        System.out.println("HCF of " + num1 + " and " + num2 + " is " + divisor);

        scan.close();
    }
}
