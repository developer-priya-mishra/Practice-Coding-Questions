import java.util.Scanner;

class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the decimal number : ");
        int num = scan.nextInt();

        // Finding binary number in reverse order
        int reverseBinaryNumber = 0;
        while (num != 0) {
            int remainder = num % 2;
            reverseBinaryNumber = reverseBinaryNumber * 10 + remainder;
            num = num / 2;
        }

        // Finding binary number in correct order
        int binaryNumber = 0;
        System.out.print("Decimal number : ");
        while (reverseBinaryNumber != 0) {
            int remainder = reverseBinaryNumber % 10;
            binaryNumber = binaryNumber * 10 + remainder;
            reverseBinaryNumber = reverseBinaryNumber / 10;
        }
        System.out.print(binaryNumber);

        scan.close();
    }
}