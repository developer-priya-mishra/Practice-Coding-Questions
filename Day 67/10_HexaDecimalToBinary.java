import java.util.Scanner;

class HexaDecimalToBinary1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the hexadecimal number : ");
        String hexaDecimalNumber = scan.nextLine();

        int reverseBinaryNumber[] = new int[100];
        int index = 0;
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
            reverseBinaryNumber[index] = lastDigit;
            hexaDecimalNumber = hexaDecimalNumber.substring(0, hexaDecimalNumber.length() - 1);
            index += 1;
        }
        int binaryNumber = 0;
        for (int i = index - 1; i >= 0; i--) {
            binaryNumber = binaryNumber * 10000 + reverseBinaryNumber[i];
        }
        System.out.println("Binary Number is " + binaryNumber);
        scan.close();
    }
}

class HexaDecimalToBinary2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the hexadecimal number : ");
        String hexaDecimalNumber = scan.nextLine();

        StringBuilder binaryNumber = new StringBuilder();
        String lastDigit = "";

        while (hexaDecimalNumber != "") {
            char lastChar = hexaDecimalNumber.charAt(hexaDecimalNumber.length() - 1);
            switch (lastChar) {
                case '0':
                    lastDigit = "0000";
                    break;
                case '1':
                    lastDigit = "0001";
                    break;
                case '2':
                    lastDigit = "0010";
                    break;
                case '3':
                    lastDigit = "0011";
                    break;
                case '4':
                    lastDigit = "0100";
                    break;
                case '5':
                    lastDigit = "0101";
                    break;
                case '6':
                    lastDigit = "0110";
                    break;
                case '7':
                    lastDigit = "0111";
                    break;
                case '8':
                    lastDigit = "1000";
                    break;
                case '9':
                    lastDigit = "1001";
                    break;
                case 'A':
                    lastDigit = "1010";
                    break;
                case 'B':
                    lastDigit = "1011";
                    break;
                case 'C':
                    lastDigit = "1100";
                    break;
                case 'D':
                    lastDigit = "1101";
                    break;
                case 'E':
                    lastDigit = "1110";
                    break;
                case 'F':
                    lastDigit = "1111";
                    break;
                default:
                    break;
            }
            binaryNumber.insert(0, lastDigit);
            hexaDecimalNumber = hexaDecimalNumber.substring(0, hexaDecimalNumber.length() - 1);
        }
        System.out.println("Binary Number is " + Integer.parseInt(binaryNumber.toString()));
        scan.close();
    }
}

class HexaDecimalToBinary3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the hexadecimal number : ");
        String hexaDecimalNumber = scan.nextLine();

        int decimalNumber = Integer.parseInt(hexaDecimalNumber, 16);
        String binaryNumber = Integer.toBinaryString(decimalNumber);
        System.out.println("Binary Number is " + binaryNumber);
        scan.close();
    }
}
