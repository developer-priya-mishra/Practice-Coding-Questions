import java.util.Scanner;

class HexaDecimalToDecimal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the hexadecimal number : ");
        String hexadecimalNumber = scan.nextLine();

        int count = 0;
        int decimalNumber = 0;
        int lastDigit = 0;
        for (int i = hexadecimalNumber.length() - 1; i >= 0; i--) {
            char remainder = hexadecimalNumber.charAt(i);
            switch (remainder) {
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
                    lastDigit = remainder - 48;
                    break;
            }
            decimalNumber += lastDigit * (Math.pow(16, count));
            count++;
        }

        System.out.println(decimalNumber);

        scan.close();
    }
}
