import java.util.Scanner;

class OctalToHexadecimalThroughDecimal1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Octal number : ");
        int octalNumber = scan.nextInt();

        // Octal to Decimal
        int decimalNumber = 0;
        int power = 0;
        while (octalNumber != 0) {
            int remainder = octalNumber % 10;
            if (remainder == 8 || remainder == 9) {
                System.out.println("Invalid octal number");
                decimalNumber = -1;
                break;
            } else {
                decimalNumber += remainder * Math.pow(8, power);
                power += 1;
                octalNumber = octalNumber / 10;
            }

        }

        // Decimal to Hexadecimal
        if (decimalNumber != -1) {
            int reverseHexadecimalNumber[] = new int[100];
            int index = 0;
            while (decimalNumber != 0) {
                int remainder = decimalNumber % 16;
                reverseHexadecimalNumber[index] = remainder;
                decimalNumber = decimalNumber / 16;
                index += 1;
            }
            String hexadecimalNumber = "";
            for (int i = index - 1; i >= 0; i--) {
                switch (reverseHexadecimalNumber[i]) {
                    case 10:
                        hexadecimalNumber += "A";
                        break;

                    case 11:
                        hexadecimalNumber += "B";
                        break;

                    case 12:
                        hexadecimalNumber += "C";
                        break;

                    case 13:
                        hexadecimalNumber += "D";
                        break;

                    case 14:
                        hexadecimalNumber += "E";
                        break;

                    case 15:
                        hexadecimalNumber += "F";
                        break;
                    default:
                        hexadecimalNumber += reverseHexadecimalNumber[i];
                        break;
                }
            }
            System.out.println("Hexadecimal number is : " + hexadecimalNumber);
        }

        scan.close();
    }
}

class OctalToHexadecimalThroughDecimal2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Octal number : ");
        String octalNumber = scan.next();

        int decimalNumber = Integer.parseInt(octalNumber, 8);
        String hexadecimalNumber = Integer.toHexString(decimalNumber);

        System.out.print("Hexadecimal number is " + hexadecimalNumber.toUpperCase());
        scan.close();
    }
}

class OctalToHexadecimalThroughBinary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Octal number : ");
        int octalNumber = scan.nextInt();

        // Octal to Binary
        int reverseBinary[] = new int[100];
        int index1 = 0;

        while (octalNumber != 0) {
            int remainder = octalNumber % 10;
            switch (remainder) {
                case 0:
                    remainder = 0;
                    break;
                case 1:
                    remainder = 1;
                    break;
                case 2:
                    remainder = 10;
                    break;
                case 3:
                    remainder = 11;
                    break;
                case 4:
                    remainder = 100;
                    break;
                case 5:
                    remainder = 101;
                    break;
                case 6:
                    remainder = 110;
                    break;
                case 7:
                    remainder = 111;
                    break;
                default:
                    break;
            }
            reverseBinary[index1] = remainder;
            octalNumber = octalNumber / 10;
            index1 += 1;
        }

        int binaryNumber = 0;
        for (int i = index1 - 1; i >= 0; i--) {
            binaryNumber = binaryNumber * 1000 + reverseBinary[i];
        }

        // Binary to Hexadecimal
        char reverseHexadecimalNumber[] = new char[100];
        int index2 = 0;
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
            reverseHexadecimalNumber[index2] = lastDigit;
            index2 += 1;
            binaryNumber = binaryNumber / 10000;
        }

        String hexadecimalNumber = "";
        for (int i = index2 - 1; i >= 0; i--) {
            hexadecimalNumber = hexadecimalNumber + reverseHexadecimalNumber[i];
        }
        System.out.println("Hexadecimal number is " + hexadecimalNumber);
        scan.close();
    }
}
