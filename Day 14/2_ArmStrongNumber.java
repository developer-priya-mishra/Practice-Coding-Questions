import java.util.Scanner;

class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        // Calculating the number of digits
        int tempNum = num;
        int numberOfDigit = 0;
        for (int i = tempNum; i != 0; i = i / 10) {
            numberOfDigit = numberOfDigit + 1;
        }
        System.out.println(numberOfDigit);

        double mult = 0;
        while (tempNum != 0) {
            int n = tempNum % 10;
            double power = Math.pow(n, numberOfDigit);
            mult += power;
            tempNum = tempNum / 10;
        }

        if (mult == num) {
            System.out.println(num + " is a Armstrong number");
        } else {
            System.out.println(num + " is not a Armstrong number");
        }

        scan.close();
    }
}