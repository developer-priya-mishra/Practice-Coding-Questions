import java.util.Scanner;

// A number is called an Automorphic number if and only if its square ends in the same digits as the number itself.
class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        int sqaureOfNumber = num * num;

        int count = 0;
        int number = num;
        while (number != 0) {
            count += 1;
            number = number / 10;
        }

        int reverseNum = 0;
        for (int i = 1; i <= count; i++) {
            int remainder = sqaureOfNumber % 10;
            reverseNum = reverseNum * 10 + remainder;
            sqaureOfNumber = sqaureOfNumber / 10;
        }

        int tempNum = 0;
        while (reverseNum != 0) {
            int remainder = reverseNum % 10;
            tempNum = tempNum * 10 + remainder;
            reverseNum = reverseNum / 10;
        }

        if (tempNum == num) {
            System.out.println(num + " is a Automorphic number");
        } else {
            System.out.println(num + " is not a Automorphic number");
        }

        scan.close();
    }
}
