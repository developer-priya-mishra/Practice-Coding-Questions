import java.util.Scanner;

class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the decimal number : ");
        int decimalNumber = scan.nextInt();

        int reverseBinaryNumber[] = new int[100];
        int index = 0;
        while (decimalNumber != 0) {
            int remainder = decimalNumber % 2;
            reverseBinaryNumber[index] = remainder;
            index++;
            decimalNumber = decimalNumber / 2;
        }

        System.out.print("Binary number is ");
        int binaryNumber = 0;
        for (int i = index - 1; i >= 0; i--) {
            binaryNumber = binaryNumber * 10 + reverseBinaryNumber[i];
        }

        System.out.println(binaryNumber);

        scan.close();
    }
}
