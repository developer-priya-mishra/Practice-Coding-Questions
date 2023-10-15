import java.util.Scanner;

class OctalToDecimal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Octal number : ");
        int num = scan.nextInt();

        int decimalNumber = 0;
        int power = 0;
        loop: while (num != 0) {
            int remainder = num % 10;
            if (remainder == 8 || remainder == 9) {
                System.out.println("Invalid octal number");
                decimalNumber = -1;
                break loop;
            } else {
                decimalNumber += remainder * Math.pow(8, power);
                power += 1;
                num = num / 10;
            }

        }
        if (decimalNumber != -1) {
            System.out.print("Decimal number is " + decimalNumber);
        }

        scan.close();
    }
}
