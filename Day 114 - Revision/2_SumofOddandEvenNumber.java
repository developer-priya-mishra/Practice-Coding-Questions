import java.util.Scanner;

class SumofOddandEvenNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        int temp = num;
        int oddSum = 0;
        int evenSum = 0;
        while (temp != 0) {
            int remainder = temp % 10;
            if (remainder % 2 == 0) {
                evenSum += remainder;
            } else {
                oddSum += remainder;
            }
            temp = temp / 10;
        }

        System.out.println("Sum of even numbers : " + evenSum);
        System.out.println("Sum of odd numbers : " + oddSum);
        scan.close();
    }
}
