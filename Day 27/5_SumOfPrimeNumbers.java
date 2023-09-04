import java.util.Scanner;

class SumOfPrimeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int num1 = scan.nextInt();

        System.out.print("Enter the second number : ");
        int num2 = scan.nextInt();

        int sum = 0;
        for (int i = num1; i <= num2; i++) {
            boolean isPrimeNumber = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
            if (isPrimeNumber) {
                // System.out.println(i + " ");
                sum += i;
            }
        }
        System.out.print("Sum of all prime numbers in an interval : " + sum);
        scan.close();
    }
}
