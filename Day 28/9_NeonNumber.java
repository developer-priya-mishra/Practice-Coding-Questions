import java.util.Scanner;

// A neon number is a number where the sum of digits of square of the number is equal to the number. For example if the input number is 9, its square is 9*9 = 81 and sum of the digits is 9.

class NeonNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        int squareOfNumber = num * num;

        int sum = 0;
        while (squareOfNumber != 0) {
            int remainder = squareOfNumber % 10;
            sum += remainder;
            squareOfNumber = squareOfNumber / 10;
        }

        if (sum == num) {
            System.out.println(num + " is a Neon Number");
        } else {
            System.out.println(num + " is not a Neon Number");
        }

        scan.close();
    }
}
