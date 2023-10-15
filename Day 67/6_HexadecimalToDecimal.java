import java.util.Scanner;

class HexadecimalToDecimal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the hexadecimal number : ");
        String hexDecimalNumber = scan.nextLine();

        int power = 0;
        int decimalNumber = 0;
        int lastDigit;
        while (hexDecimalNumber != "") {
            char lastChar = hexDecimalNumber.charAt(hexDecimalNumber.length() - 1);
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
                    lastDigit = lastChar;
                    break;
            }
            decimalNumber += lastDigit * Math.pow(16, power);
            power += 1;
            hexDecimalNumber = hexDecimalNumber.substring(0, hexDecimalNumber.length() - 1);
        }
        System.out.println("Decimal number is " + decimalNumber);
        scan.close();
    }
}