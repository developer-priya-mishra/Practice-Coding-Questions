import java.util.Scanner;

class SumofFactorialNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        int sum = 0;
        for (int i = 1; i <= num; i++) {
            int factorial = i;
            sum += factorial;
        }
        System.out.println("Sum of factorial of " + num + " is " + sum);
        scan.close();
    }
}
