import java.util.Scanner;

// Harshad number (or Niven number) is an integer that is divisible by the sum of its digits.
class HarshadNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        int sum = 0;
        int tempNum = num;
        while (tempNum != 0) {
            int remainder = tempNum % 10;
            sum += remainder;
            tempNum = tempNum / 10;
        }

        if (num % sum == 0) {
            System.out.println(num + " is a Harshad Number");
        } else {
            System.out.println(num + " is not a Harshad Number");
        }

        scan.close();
    }
}
