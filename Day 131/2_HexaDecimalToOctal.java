import java.util.Scanner;

class HexaDecimalToOctalUsingBinary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the hexadecimal number : ");
        String hexadecimalNumber = scan.nextLine();

        int lastDigit1 = 0;
        int binaryNumber = 0;
        for (int i = 0; i < hexadecimalNumber.length(); i++) {
            char remainder = hexadecimalNumber.charAt(i);
            switch (remainder) {
                case '0':
                    lastDigit1 = 0000;
                    break;
                case '1':
                    lastDigit1 = 0001;
                    break;
                case '2':
                    lastDigit1 = 0010;
                    break;
                case '3':
                    lastDigit1 = 0011;
                    break;
                case '4':
                    lastDigit1 = 0100;
                    break;
                case '5':
                    lastDigit1 = 0101;
                    break;
                case '6':
                    lastDigit1 = 0110;
                    break;
                case '7':
                    lastDigit1 = 0111;
                    break;
                case '8':
                    lastDigit1 = 1000;
                    break;
                case '9':
                    lastDigit1 = 1001;
                    break;
                case 'A':
                    lastDigit1 = 1010;
                    break;
                case 'B':
                    lastDigit1 = 1011;
                    break;
                case 'C':
                    lastDigit1 = 1100;
                    break;
                case 'D':
                    lastDigit1 = 1101;
                    break;
                case 'E':
                    lastDigit1 = 1110;
                    break;
                case 'F':
                    lastDigit1 = 1111;
                    break;
                default:
                    break;
            }
            binaryNumber = binaryNumber * 10000 + lastDigit1;
        }

        int reverseHexaDecimalNumber = 0;
        int lastDigit2 = 0;
        while (binaryNumber != 0) {
            int remainder = binaryNumber % 1000;
            switch (remainder) {
                case 0:
                    lastDigit2 = 0;
                    break;

                case 1:
                    lastDigit2 = 1;
                    break;

                case 10:
                    lastDigit2 = 2;
                    break;

                case 11:
                    lastDigit2 = 3;
                    break;

                case 100:
                    lastDigit2 = 4;
                    break;

                case 101:
                    lastDigit2 = 5;
                    break;

                case 110:
                    lastDigit2 = 6;
                    break;

                case 111:
                    lastDigit2 = 7;
                    break;
            }
            reverseHexaDecimalNumber = reverseHexaDecimalNumber * 10 + lastDigit2;
            binaryNumber = binaryNumber / 1000;
        }

        int octalNumber = 0;
        while (reverseHexaDecimalNumber != 0) {
            int remainder = reverseHexaDecimalNumber % 10;
            octalNumber = octalNumber * 10 + remainder;
            reverseHexaDecimalNumber = reverseHexaDecimalNumber / 10;
        }

        System.out.println("Octal Number is " + octalNumber);
        scan.close();
    }
}

class HexaDecimalToOctalUsingDecimal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the hexadecimal number : ");
        String hexadecimalNumber = scan.nextLine();

        int count = 0;
        int decimalNumber = 0;
        int lastDigit1 = 0;
        for (int i = hexadecimalNumber.length() - 1; i >= 0; i--) {
            char remainder = hexadecimalNumber.charAt(i);
            switch (remainder) {
                case 'A':
                    lastDigit1 = 10;
                    break;
                case 'B':
                    lastDigit1 = 11;
                    break;
                case 'C':
                    lastDigit1 = 12;
                    break;
                case 'D':
                    lastDigit1 = 13;
                    break;
                case 'E':
                    lastDigit1 = 14;
                    break;
                case 'F':
                    lastDigit1 = 15;
                    break;
                default:
                    lastDigit1 = remainder - 48;
                    break;
            }
            decimalNumber += lastDigit1 * (Math.pow(16, count));
            count++;
        }

        int reverseOctalNumber[] = new int[decimalNumber];
        int index = 0;
        while (decimalNumber != 0) {
            int remainder = decimalNumber % 8;
            reverseOctalNumber[index] = remainder;
            index++;
            decimalNumber = decimalNumber / 8;
        }

        int octalNumber = 0;
        for (int i = index - 1; i >= 0; i--) {
            octalNumber = octalNumber * 10 + reverseOctalNumber[i];
        }

        System.out.println("Octal Number " + octalNumber);
        scan.close();
    }
}
