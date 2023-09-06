import java.util.Scanner;

// A Krishnamurthy number is a number whose sum of the factorial of digits is equal to the number itself. For example, 145 is the sum of the factorial of each digit.
class KrishnamurthyNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        int number = num;
        int sum = 0;
        while (number != 0) {
            int remainder = number % 10;
            int factorial = 1;
            for (int i = 1; i <= remainder; i++) {
                factorial *= i;
            }
            sum += factorial;
            number = number / 10;
        }

        if (sum == num) {
            System.out.println(num + " is a Krishnamurthy Number");
        } else {
            System.out.println(num + " is not a Krishnamurthy Number");
        }

        scan.close();
    }
}
