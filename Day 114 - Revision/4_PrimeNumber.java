import java.util.Scanner;

class PrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        boolean isPrime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.print(num + " is a Prime number");
        } else {
            System.out.print(num + " is not a Prime number");
        }

        scan.close();
    }
}
