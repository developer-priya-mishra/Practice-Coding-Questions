import java.util.Scanner;

class HexadecimalToOctalThroughDecimal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the hexadecimal number : ");
        String hexadecimalNumber = scan.nextLine();

        // HexaDecimal to Decimal
        int power = 0;
        int decimalNumber = 0;
        int lastDigit;
        while (hexadecimalNumber != "") {
            char lastChar = hexadecimalNumber.charAt(hexadecimalNumber.length() - 1);
            switch (lastChar) {
                case 'A':
                    lastDigit = 10;
                    break;
                case 'B':
                    lastDigit = 11;
                    break;
                case 'C':
                    lastDigit = 12;
                    break;
                case 'D':
                    lastDigit = 13;
                    break;
                case 'E':
                    lastDigit = 14;
                    break;
                case 'F':
                    lastDigit = 15;
                    break;
                default:
                    lastDigit = (int) (lastChar - 48);
                    break;
            }
            decimalNumber += lastDigit * Math.pow(16, power);
            power += 1;
            hexadecimalNumber = hexadecimalNumber.substring(0, hexadecimalNumber.length() - 1);
        }

        // Decimal to Octal
        int reverseOctalNumber[] = new int[100];
        int index = 0;
        while (decimalNumber != 0) {
            int remainder = decimalNumber % 8;
            reverseOctalNumber[index] = remainder;
            decimalNumber = decimalNumber / 8;
            index += 1;
        }

        int octalNumber = 0;
        for (int i = index - 1; i >= 0; i--) {
            octalNumber = octalNumber * 10 + reverseOctalNumber[i];
        }
        System.out.print("Octal number is " + octalNumber);

        scan.close();
    }

}

class HexadecimalToOctalThroughBinary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the hexadecimal number : ");
        String hexaDecimalNumber = scan.nextLine();

        // Hexadecimal to Binary
        int reverseBinaryNumber[] = new int[100];
        int index1 = 0;
        int lastDigit = 0;

        while (hexaDecimalNumber != "") {
            char lastChar = hexaDecimalNumber.charAt(hexaDecimalNumber.length() - 1);
            switch (lastChar) {
                case '0':
                    lastDigit = 0;
                    break;
                case '1':
                    lastDigit = 1;
                    break;
                case '2':
                    lastDigit = 10;
                    break;
                case '3':
                    lastDigit = 11;
                    break;
                case '4':
                    lastDigit = 100;
                    break;
                case '5':
                    lastDigit = 101;
                    break;
                case '6':
                    lastDigit = 110;
                    break;
                case '7':
                    lastDigit = 111;
                    break;
                case '8':
                    lastDigit = 1000;
                    break;
                case '9':
                    lastDigit = 1001;
                    break;
                case 'A':
                    lastDigit = 1010;
                    break;
                case 'B':
                    lastDigit = 1011;
                    break;
                case 'C':
                    lastDigit = 1100;
                    break;
                case 'D':
                    lastDigit = 1101;
                    break;
                case 'E':
                    lastDigit = 1110;
                    break;
                case 'F':
                    lastDigit = 1111;
                    break;
                default:
                    break;
            }
            reverseBinaryNumber[index1] = lastDigit;
            hexaDecimalNumber = hexaDecimalNumber.substring(0, hexaDecimalNumber.length() - 1);
            index1 += 1;
        }
        int binaryNumber = 0;
        for (int i = index1 - 1; i >= 0; i--) {
            binaryNumber = binaryNumber * 10000 + reverseBinaryNumber[i];
        }

        // Binary to Octal

        int reverseOctal[] = new int[100];
        int index2 = 0;
        while (binaryNumber != 0) {
            int remainder = binaryNumber % 1000;
            switch (remainder) {
                case 0:
                    remainder = 0;
                    break;
                case 1:
                    remainder = 1;
                    break;
                case 10:
                    remainder = 2;
                    break;
                case 11:
                    remainder = 3;
                    break;
                case 100:
                    remainder = 4;
                    break;
                case 101:
                    remainder = 5;
                    break;
                case 110:
                    remainder = 6;
                    break;
                case 111:
                    remainder = 7;
                    break;
                default:
                    break;
            }
            reverseOctal[index2] = remainder;
            index2 += 1;
            binaryNumber = binaryNumber / 1000;
        }
        int octalNumber = 0;
        for (int i = index2 - 1; i >= 0; i--) {
            octalNumber = octalNumber * 10 + reverseOctal[i];
        }
        System.out.println("Octal number is " + octalNumber);

        scan.close();
    }

}

class HexadecimalToOctalThroughDecimal2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the hexadecimal number : ");
        String hexadecimalNumber = scan.nextLine();

        int decimalNumber = Integer.parseInt(hexadecimalNumber, 16);
        String octalNumber = Integer.toOctalString(decimalNumber);

        System.out.println("Octal number is " + octalNumber);
        scan.close();
    }
}