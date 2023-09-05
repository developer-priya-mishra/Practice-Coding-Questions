import java.util.Scanner;

// Happy number is a number which eventually reaches 1 when replaced by the sum of the square of each digit.But if it reaches 4,then it is not a happy nmber.
class HappyNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        int tempNum = num;
        while (tempNum != 1 && tempNum != 4) {
            tempNum = calculateSumOfSquareOfDigits(tempNum);
        }

        if (tempNum == 1) {
            System.out.println(num + " is a Happy number");
        } else {
            System.out.println(num + " is not a Happy number");
        }

        scan.close();
    }

    static int calculateSumOfSquareOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            int remainder = number % 10;
            sum += remainder * remainder;
            number = number / 10;
        }
        return sum;
    }
}
