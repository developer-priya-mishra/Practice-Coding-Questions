import java.util.Scanner;

class DecimalToBinary1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the decimal number : ");
        int decimalNumber = scan.nextInt();

        int reverseBinaryNumber[] = new int[100];
        int index = 0;

        while (decimalNumber != 0) {
            int remainder = decimalNumber % 2;
            reverseBinaryNumber[index] = remainder;
            decimalNumber = decimalNumber / 2;
            index += 1;
        }

        int binaryNumber = 0;
        for (int i = index - 1; i >= 0; i--) {
            binaryNumber = binaryNumber * 10 + reverseBinaryNumber[i];
        }
        System.out.print("Binary number is " + binaryNumber);

        scan.close();
    }
}

class DecimalToBinary2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the decimal number : ");
        int decimalNumber = scan.nextInt();

        StringBuilder binaryNumber = new StringBuilder();

        while (decimalNumber != 0) {
            int remainder = decimalNumber % 2;
            binaryNumber.insert(0, remainder);
            decimalNumber = decimalNumber / 2;
        }

        System.out.print("Binary number is " + binaryNumber);

        scan.close();
    }
}

class DecimalToBinary3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the decimal number : ");
        int decimalNumber = scan.nextInt();

        String binaryNumber = Integer.toBinaryString(decimalNumber);

        System.out.print("Binary number is " + binaryNumber);

        scan.close();
    }
}