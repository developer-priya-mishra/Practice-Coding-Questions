import java.util.Scanner;

class BinaryToHexaDecimal1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the binary number : ");
        int binaryNumber = scan.nextInt();

        char reverseHexadecimalNumber[] = new char[100];
        int index = 0;
        char lastDigit = 0;
        while (binaryNumber != 0) {
            int remainder = binaryNumber % 10000;
            switch (remainder) {
                case 0:
                    lastDigit = '0';
                    break;
                case 1:
                    lastDigit = '1';
                    break;
                case 10:
                    lastDigit = '2';
                    break;
                case 11:
                    lastDigit = '3';
                    break;
                case 100:
                    lastDigit = '4';
                    break;
                case 101:
                    lastDigit = '5';
                    break;
                case 110:
                    lastDigit = '6';
                    break;
                case 111:
                    lastDigit = '7';
                    break;
                case 1000:
                    lastDigit = '8';
                    break;
                case 1001:
                    lastDigit = '9';
                    break;
                case 1010:
                    lastDigit = 'A';
                    break;
                case 1011:
                    lastDigit = 'B';
                    break;
                case 1100:
                    lastDigit = 'C';
                    break;
                case 1101:
                    lastDigit = 'D';
                    break;
                case 1110:
                    lastDigit = 'E';
                    break;
                case 1111:
                    lastDigit = 'F';
                    break;
                default:
                    break;
            }
            reverseHexadecimalNumber[index] = lastDigit;
            index += 1;
            binaryNumber = binaryNumber / 10000;
        }

        String hexadecimalNumber = "";
        for (int i = index - 1; i >= 0; i--) {
            hexadecimalNumber = hexadecimalNumber + reverseHexadecimalNumber[i];
        }
        System.out.println("Hexadecimal number is " + hexadecimalNumber);
        scan.close();
    }
}

class BinaryToHexaDecimal2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the binary number : ");
        int binaryNumber = scan.nextInt();

        StringBuilder hexadecimalNumber = new StringBuilder();
        char lastDigit = 0;
        while (binaryNumber != 0) {
            int remainder = binaryNumber % 10000;
            switch (remainder) {
                case 0:
                    lastDigit = '0';
                    break;
                case 1:
                    lastDigit = '1';
                    break;
                case 10:
                    lastDigit = '2';
                    break;
                case 11:
                    lastDigit = '3';
                    break;
                case 100:
                    lastDigit = '4';
                    break;
                case 101:
                    lastDigit = '5';
                    break;
                case 110:
                    lastDigit = '6';
                    break;
                case 111:
                    lastDigit = '7';
                    break;
                case 1000:
                    lastDigit = '8';
                    break;
                case 1001:
                    lastDigit = '9';
                    break;
                case 1010:
                    lastDigit = 'A';
                    break;
                case 1011:
                    lastDigit = 'B';
                    break;
                case 1100:
                    lastDigit = 'C';
                    break;
                case 1101:
                    lastDigit = 'D';
                    break;
                case 1110:
                    lastDigit = 'E';
                    break;
                case 1111:
                    lastDigit = 'F';
                    break;
                default:
                    break;
            }
            hexadecimalNumber.insert(0, lastDigit);
            binaryNumber = binaryNumber / 10000;
        }
        System.out.println("Hexadecimal number is " + hexadecimalNumber);
        scan.close();
    }
}

class BinaryToHexaDecimal3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the binary number : ");
        String binaryNumber = scan.next();

        int decimalNumber = Integer.parseInt(binaryNumber, 2);
        String hexadecimalNumber = Integer.toHexString(decimalNumber);
        System.out.println("Hexadecimal number is " + hexadecimalNumber.toUpperCase());
        scan.close();
    }
}
