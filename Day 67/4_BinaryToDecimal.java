import java.util.Scanner;

class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the binary number : ");
        int num = scan.nextInt();

        double power = 0;
        int decimalNumber = 0;
        while (num != 0) {
            int remainder = num % 10;
            decimalNumber += remainder * Math.pow(2, power);
            power += 1;
            num = num / 10;
        }

        System.out.print("Decimal number is " + decimalNumber);
        scan.close();
    }
}
