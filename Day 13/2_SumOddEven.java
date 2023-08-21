import java.util.Scanner;

class SumOddEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        int allSum = 0;
        int evenSum = 0;
        int oddSum = 0;

        for (int i = num; i % 10 != 0; i = i / 10) {
            int number = i % 10;
            allSum += number;
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
        }

        System.out.println("Sum of each digits : " + allSum);
        System.out.println("Sum of even digits : " + evenSum);
        System.out.println("Sum of odd digits : " + oddSum);
        scan.close();
    }
}
