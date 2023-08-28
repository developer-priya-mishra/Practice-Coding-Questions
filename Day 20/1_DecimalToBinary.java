import java.util.Scanner;

class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the decimal number : ");
        int num = scan.nextInt();

        int quotient = num;
        int reverse = 0;
        while (quotient != 0) {
            int remainder = quotient % 2;
            reverse = reverse * 10 + remainder;
            quotient = quotient / 2;
        }

        int binaryNumber = 0;
        System.out.print("Decimal number : ");
        while (reverse != 0) {
            binaryNumber = reverse % 10;
            System.out.print(binaryNumber);
            reverse = reverse / 10;
        }
        scan.close();
    }
}