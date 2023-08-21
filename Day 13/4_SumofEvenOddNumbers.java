import java.util.Scanner;

class SumofEvenOddNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        int evenSum = 0;
        int oddSum = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }
        System.out.println("Sum of first " + num + " even natural number is " + evenSum);
        System.out.println("Sum of first " + num + " odd natural number is " + oddSum);
        scan.close();
    }
}