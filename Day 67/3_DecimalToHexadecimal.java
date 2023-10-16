import java.util.Scanner;

class DecimalToHexadecimal1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the decimal number : ");
        int decimalNumber = scan.nextInt();

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

        scan.close();
    }
}

class DecimalToHexadecimal2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the decimal number : ");
        int decimalNumber = scan.nextInt();

        StringBuilder hexadecimalNumber = new StringBuilder();

        while (decimalNumber != 0) {
            int remainder = decimalNumber % 16;

            char asciiChar = '\0';

            switch (remainder) {
                case 10:
                    asciiChar = 'A';
                    break;

                case 11:
                    asciiChar = 'B';
                    break;

                case 12:
                    asciiChar = 'C';
                    break;

                case 13:
                    asciiChar = 'D';
                    break;

                case 14:
                    asciiChar = 'E';
                    break;

                case 15:
                    asciiChar = 'F';
                    break;
                default:
                    asciiChar = (char) (remainder + 48);
                    break;
            }
            hexadecimalNumber.insert(0, asciiChar);
            decimalNumber = decimalNumber / 16;
        }
        System.out.println("Hexadecimal number is : " + hexadecimalNumber);
        scan.close();
    }
}

class DecimalToHexadecimal3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the decimal number : ");
        int decimalNumber = scan.nextInt();

        String hexadecimalNumber = Integer.toHexString(decimalNumber);
        System.out.println("Hexadecimal number is : " + hexadecimalNumber.toUpperCase());
        scan.close();
    }
}
