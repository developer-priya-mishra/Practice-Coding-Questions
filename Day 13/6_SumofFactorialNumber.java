import java.util.Scanner;

class SumofFactorialNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        int sum = 0;

        for (int n = 1; n <= num; n++) {
            int factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            // System.out.println(factorial);
            sum += factorial;
        }

        System.out.println("Sum of factorial of first " + num + " natural numbers is " + sum);
        scan.close();
    }
}
