import java.util.Scanner;

class HexaDecimalToBinary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the hexadecimal number : ");
        String hexaDecimal = scan.nextLine();

        int reverseDecimal = 0;
        int lastDigit = 0;
        while (hexaDecimal != "") {
            char lastChar = hexaDecimal.charAt(hexaDecimal.length() - 1);
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
            reverseDecimal = reverseDecimal * 10000 + lastDigit;
            System.out.println(reverseDecimal);
            hexaDecimal = hexaDecimal.substring(0, hexaDecimal.length() - 1);
        }

        int binaryNumber = 0;
        while (reverseDecimal != 0) {
            reverseDecimal = reverseDecimal % 10000;
            binaryNumber = binaryNumber * 10000 + reverseDecimal;
            reverseDecimal = reverseDecimal / 10000;
        }
        System.out.println("Binary Number is " + binaryNumber);
        scan.close();
    }
}
