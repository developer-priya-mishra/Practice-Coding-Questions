import java.util.Scanner;

class SumOfFactorials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the nth series : ");
        int num = scan.nextInt();

        int sum = 0;
        for (int i = 1; i <= num; i++) {
            int factorial = 1;
            for (int j = 1; j <= i; j++) {
                factorial = factorial * j;
            }
            sum = sum + factorial;
        }
        System.out.print("Sum of 1!+2!+3!+....." + num + "!" + " is " + sum);
        scan.close();

    }
}
