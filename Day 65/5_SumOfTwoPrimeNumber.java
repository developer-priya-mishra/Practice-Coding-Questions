import java.util.Scanner;

class SumOfTwoPrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        int arr[] = new int[num];
        int index = 0;

        for (int i = 2; i <= num; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                arr[index] = i;
                index = index + 1;
            }
        }

        int size = index;
        boolean isSumOfPrimeNumber = false;
        loop: for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                if (arr[i] + arr[j] == num) {
                    isSumOfPrimeNumber = true;
                    break loop;
                }
            }
        }

        if (isSumOfPrimeNumber) {
            System.out.println(num + " is sum of two prime number");
        } else {
            System.out.println(num + " is not the sum of two prime number");
        }
        scan.close();
    }
}