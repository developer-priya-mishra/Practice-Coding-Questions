import java.util.Scanner;

class ArmStrongNumberInIntervals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int num1 = scan.nextInt();

        System.out.print("Enter second number : ");
        int num2 = scan.nextInt();

        for (int i = num1; i <= num2; i++) {

            // Calculating number of digits in a number
            int tempNum = i;
            int numberOfDigit = 0;
            while (tempNum != 0) {
                numberOfDigit = numberOfDigit + 1;
                tempNum = tempNum / 10;
            }
            // System.out.println(numberOfDigit);

            // Calculating Armstrong number
            tempNum = i;
            int sum = 0;
            while (tempNum != 0) {
                int lastDigit = tempNum % 10;
                double power = Math.pow(lastDigit, numberOfDigit);
                sum += power;
                tempNum = tempNum / 10;
            }

            if (sum == i) {
                System.out.println(sum);
            }

        }

        scan.close();
    }
}