import java.util.Scanner;

class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the binary number : ");
        int binaryNumber = scan.nextInt();

        int count = 0;
        int decimalNumber = 0;
        while (binaryNumber != 0) {
            int reverseNumber = binaryNumber % 10;
            decimalNumber += (int) (reverseNumber * Math.pow(2, count));
            count++;
            binaryNumber = binaryNumber / 10;
        }

        System.out.print("Decimal Number : " + decimalNumber);

        scan.close();
    }
}