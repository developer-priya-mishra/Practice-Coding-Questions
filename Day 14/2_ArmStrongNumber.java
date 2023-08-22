import java.util.Scanner;

class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        int count = 0;
        int quotient = num;
        int n;
        double mult = 0;

        for (int i = quotient; i % 10 != 0; i = i / 10) {
            count = count + 1;
        }

        while (quotient % 10 != 0) {
            n = quotient % 10;
            double power = Math.pow(n, count);
            mult += power;
            quotient = quotient / 10;
        }

        if (mult == num) {
            System.out.println(num + " is a Armstrong number");
        } else {
            System.out.println(num + " is not a Armstrong number");
        }

        scan.close();
    }
}