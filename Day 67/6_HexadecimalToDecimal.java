import java.util.Scanner;

class HexadecimalToDecimal1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the hexadecimal number : ");
        String hexadecimalNumber = scan.nextLine();

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
        System.out.println("Decimal number is " + decimalNumber);
        scan.close();
    }
}

class HexadecimalToDecimal2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the hexadecimal number : ");
        String hexadecimalNumber = scan.nextLine();

        int decimalNumber = Integer.parseInt(hexadecimalNumber, 16);
        System.out.println("Decimal number is " + decimalNumber);
        scan.close();
    }
}
