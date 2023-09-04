import java.util.Scanner;

class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        // Calculating the number of digits
        int tempNum = num;
        int numberOfDigit = 0;
        while (tempNum != 0) {
            numberOfDigit = numberOfDigit + 1;
            tempNum = tempNum / 10;
        }

        // Calculating Armstrong number
        tempNum = num;
        double sum = 0;
        while (tempNum != 0) {
            int lastDigit = tempNum % 10;
            double power = Math.pow(lastDigit, numberOfDigit);
            sum += power;
            tempNum = tempNum / 10;
        }

        // Checking if it is armstrong no or not
        if (sum == num) {
            System.out.println(num + " is a Armstrong number");
        } else {
            System.out.println(num + " is not a Armstrong number");
        }

        scan.close();
    }
}