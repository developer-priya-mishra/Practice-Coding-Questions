import java.util.Scanner;

class PrimeNumbersBetweenIntervals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int num1 = scan.nextInt();

        System.out.print("Enter the nth number : ");
        int num2 = scan.nextInt();

        for (int i = num1; i <= num2; i++) {
            boolean isPrimeNumber = true;
            for (int j = 2; j < num1; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
            if (isPrimeNumber) {
                System.out.print(i + " ");
            }
        }
        scan.close();
    }
}
