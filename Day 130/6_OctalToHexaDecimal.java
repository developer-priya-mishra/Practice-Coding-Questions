import java.util.Scanner;

class OctalToHexaDecimalUsingBinary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the octal number : ");
        int octalNumber = scan.nextInt();

        int reverseBinaryNumber[] = new int[100];
        int index1 = 0;
        while (octalNumber != 0) {
            int remainder = octalNumber % 10;
            if (octalNumber == 8 && octalNumber == 9) {
                System.out.print(octalNumber + " is not octal number.");
            } else {
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
            }
            reverseBinaryNumber[index1] = remainder;
            index1++;
            octalNumber = octalNumber / 10;
        }

        int binaryNumber = 0;
        for (int i = index1 - 1; i >= 0; i--) {
            binaryNumber = binaryNumber * 1000 + reverseBinaryNumber[i];
        }

        System.out.println(binaryNumber);

        String lastDigit2 = "";
        String reverseHexaDecimalNumber[] = new String[100];
        int index2 = 0;
        while (binaryNumber != 0) {
            int remainder = binaryNumber % 10000;
            switch (remainder) {
                case 0:
                    lastDigit2 = "0";
                    break;
                case 1:
                    lastDigit2 = "1";
                    break;
                case 10:
                    lastDigit2 = "2";
                    break;
                case 11:
                    lastDigit2 = "3";
                    break;
                case 100:
                    lastDigit2 = "4";
                    break;
                case 101:
                    lastDigit2 = "5";
                    break;
                case 110:
                    lastDigit2 = "6";
                    break;
                case 111:
                    lastDigit2 = "7";
                    break;
                case 1000:
                    lastDigit2 = "8";
                    break;
                case 1001:
                    lastDigit2 = "9";
                    break;
                case 1010:
                    lastDigit2 = "A";
                    break;
                case 1011:
                    lastDigit2 = "B";
                    break;
                case 1100:
                    lastDigit2 = "C";
                    break;
                case 1101:
                    lastDigit2 = "D";
                    break;
                case 1110:
                    lastDigit2 = "E";
                    break;
                case 1111:
                    lastDigit2 = "F";
                    break;
                default:
                    break;
            }
            reverseHexaDecimalNumber[index2] = lastDigit2;
            index2++;
            binaryNumber = binaryNumber / 10000;
        }

        String hexaDecimalNumber = "";
        for (int i = index2 - 1; i >= 0; i--) {
            hexaDecimalNumber += reverseHexaDecimalNumber[i];
        }
        System.out.println("Hexa Decimal Number is " + hexaDecimalNumber);

        scan.close();
    }
}

class OctalToHexaDecimalUsingDecimal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the octal number : ");
        int octalNumber = scan.nextInt();

        int count = 0;
        int decimalNumber = 0;
        while (octalNumber != 0) {
            int remainder = octalNumber % 10;
            decimalNumber += remainder * (Math.pow(8, count));
            octalNumber = octalNumber / 10;
            count++;
        }

        char reverseHexaDecimalNumber[] = new char[decimalNumber];
        int index = 0;
        char lastDigit = 0;
        while (decimalNumber != 0) {
            int remainder = decimalNumber % 16;
            switch (remainder) {
                case 10:
                    lastDigit = 'A';
                    break;
                case 11:
                    lastDigit = 'B';
                    break;
                case 12:
                    lastDigit = 'C';
                    break;
                case 13:
                    lastDigit = 'D';
                    break;
                case 14:
                    lastDigit = 'E';
                    break;
                case 15:
                    lastDigit = 'F';
                    break;
                default:
                    lastDigit = (char) (remainder + 48);
                    break;
            }
            reverseHexaDecimalNumber[index] = lastDigit;
            index++;
            decimalNumber = decimalNumber / 16;
        }

        String hexaDecimalNumber = "";
        for (int i = index - 1; i >= 0; i--) {
            hexaDecimalNumber += reverseHexaDecimalNumber[i];
        }

        System.out.println("Octal Number " + hexaDecimalNumber);

        scan.close();

    }
}