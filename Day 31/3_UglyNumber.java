import java.util.Scanner;

// An ugly number is a positive integer whose prime factors are only 2 , 3 , and 5
class UglyNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        boolean isUglyNumber = true;
        for (int i = 2; i <= num; i++) {
            boolean isPrimeNumber = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }

            if (isPrimeNumber) {

                if (num % i == 0) {
                    if (i != 2 && i != 3 && i != 5) {
                        isUglyNumber = false;
                        break;
                    }
                }
            }

        }

        if (isUglyNumber) {
            System.out.println(num + " is a ugly number");
        } else {
            System.out.println(num + " is not a ugly number");
        }

        scan.close();
    }
}
