import java.util.Scanner;

class DecimalToHexadecimal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the decimal number : ");
        int num = scan.nextInt();

        int reverseHexadecimalNumber[] = new int[100];
        int index = 0;
        while (num != 0) {
            int remainder = num % 16;
            reverseHexadecimalNumber[index] = remainder;
            num = num / 16;
            index += 1;
        }

        String hexaNumber = "";
        for (int i = index - 1; i >= 0; i--) {
            switch (reverseHexadecimalNumber[i]) {
                case 10:
                    hexaNumber += "A";
                    break;

                case 11:
                    hexaNumber += "B";
                    break;

                case 12:
                    hexaNumber += "C";
                    break;

                case 13:
                    hexaNumber += "D";
                    break;

                case 14:
                    hexaNumber += "E";
                    break;

                case 15:
                    hexaNumber += "F";
                    break;
                default:
                    hexaNumber += reverseHexadecimalNumber[i];
                    break;
            }
        }
        System.out.println("Hexadecimal number is : " + hexaNumber);

        scan.close();
    }
}

class DecimalToHexadecimal2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the decimal number : ");
        int num = scan.nextInt();

        StringBuilder hexadecimal = new StringBuilder();

        while (num != 0) {
            int remainder = num % 16;
            char hexaNumber = '\0';

            switch (remainder) {
                case 10:
                    hexaNumber = 'A';
                    break;

                case 11:
                    hexaNumber = 'B';
                    break;

                case 12:
                    hexaNumber = 'C';
                    break;

                case 13:
                    hexaNumber = 'D';
                    break;

                case 14:
                    hexaNumber = 'E';
                    break;

                case 15:
                    hexaNumber = 'F';
                    break;
                default:
                    hexaNumber = (char) remainder;
                    break;
            }
            hexadecimal.insert(0, hexaNumber);
            num = num / 16;
        }

        System.out.println("Hexadecimal number is : " + hexadecimal);

        scan.close();
    }
}
