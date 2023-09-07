import java.util.Scanner;

// Twin primes are a pair of prime numbers that have a difference of 2 between them. For example, 3 and 5
class TwinPrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int num1 = scan.nextInt();

        System.out.print("Enter the second number : ");
        int num2 = scan.nextInt();

        if (checkPrimeNumber(num1) && checkPrimeNumber(num2)) {
            if (num1 - num2 == 2 || num2 - num1 == 2) {
                System.out.println(num1 + " and " + num2 + " is a twin prime number");
            } else {
                System.out.println(num1 + " and " + num2 + " is not a twin prime number");
            }
        } else {
            System.out.println("Number is not a prime number");
        }

        scan.close();
    }

    static boolean checkPrimeNumber(int number) {
        boolean isPrimeNumber = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrimeNumber = false;
                break;
            }
        }
        return isPrimeNumber;
    }
}
