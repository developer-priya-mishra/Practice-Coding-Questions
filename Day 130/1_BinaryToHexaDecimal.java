import java.util.Scanner;

class BinaryToHexaDecimal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the binary number : ");
        int binaryNumber = scan.nextInt();

        char reverseHexaDecimalNumber[] = new char[100];
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
            reverseHexaDecimalNumber[index] = lastDigit;
            index++;
            binaryNumber = binaryNumber / 10000;
        }

        String hexaDecimalNumber = "";
        for (int i = index - 1; i >= 0; i--) {
            hexaDecimalNumber += reverseHexaDecimalNumber[i];
        }

        System.out.println("Hexa Decimal Number is " + hexaDecimalNumber);
        scan.close();
    }
}
