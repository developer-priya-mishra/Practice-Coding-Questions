import java.util.Scanner;

class TwistedPrimeNumber {
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
            int reverseNum = 0;
            int tempNum = num;
            while (tempNum != 0) {
                int remainder = tempNum % 10;
                reverseNum = reverseNum * 10 + remainder;
                tempNum = tempNum / 10;
            }

            for (int i = 2; i < reverseNum; i++) {
                if (reverseNum % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(num + " is twisted prime number.");
            } else {
                System.out.println(num + " is not a twisted prime number.");
            }

        } else {
            System.out.println(num + " is not a prime number");
        }

        scan.close();
    }
}
