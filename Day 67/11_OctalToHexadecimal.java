import java.util.Scanner;

class OctalToHexadecimalThroughDecimal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Octal number : ");
        int num = scan.nextInt();

        int decimalNumber = 0;
        int power = 0;
        loop: while (num != 0) {
            int remainder = num % 10;
            if (remainder == 8 || remainder == 9) {
                System.out.println("Invalid octal number");
                decimalNumber = -1;
                break loop;
            } else {
                decimalNumber += remainder * Math.pow(8, power);
                power += 1;
                num = num / 10;
            }

        }
        if (decimalNumber != -1) {
            int reverseHexadecimalNumber[] = new int[100];
            int index = 0;
            while (decimalNumber != 0) {
                int remainder = decimalNumber % 16;
                reverseHexadecimalNumber[index] = remainder;
                decimalNumber = decimalNumber / 16;
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
        }

        scan.close();
    }
}
