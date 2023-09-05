import java.util.Scanner;

class TwistedPrimeNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        if (checkPrimeNumber(num)) {
            int reverseNum = 0;
            int tempNum = num;
            while (tempNum != 0) {
                int remainder = tempNum % 10;
                reverseNum = reverseNum * 10 + remainder;
                tempNum = tempNum / 10;
            }

            if (checkPrimeNumber(reverseNum)) {
                System.out.println(num + " is twisted prime number.");
            } else {
                System.out.println(num + " is not a twisted prime number.");
            }

        } else {
            System.out.println(num + " is not a prime number");
        }

        scan.close();
    }

    static boolean checkPrimeNumber(int number) {
        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

}
