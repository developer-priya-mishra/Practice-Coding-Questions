import java.util.Scanner;

class DecimalToHexaDecimal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the decimal number : ");
        int decimalNumber = scan.nextInt();

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
