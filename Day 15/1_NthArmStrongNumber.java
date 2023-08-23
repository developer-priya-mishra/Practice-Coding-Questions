import java.util.Scanner;

class PrintArmStrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        for (int i = 1; i <= num; i++) {
            // Counting the number of digits
            int numberOfDigits = 0;
            int tempNum = i;
            while (tempNum != 0) {
                numberOfDigits = numberOfDigits + 1;
                tempNum = tempNum / 10;
            }

            // calculating armstrong no
            tempNum = i;
            int sum = 0;
            while (tempNum != 0) {
                int lastDigit = tempNum % 10;
                double power = Math.pow(lastDigit, numberOfDigits);
                sum += power;
                tempNum = tempNum / 10;
            }

            // Checking if it is armstrong no or not
            if (sum == i) {
                System.out.println(i);
            }

        }

        scan.close();
    }
}
