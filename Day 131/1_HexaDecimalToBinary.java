import java.util.Scanner;

class HexaDecimalToBinary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the hexadecimal number : ");
        String hexadecimalNumber = scan.nextLine();

        String lastDigit = "";
        String binaryNumber = "";
        for (int i = 0; i < hexadecimalNumber.length(); i++) {
            char remainder = hexadecimalNumber.charAt(i);
            switch (remainder) {
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
            binaryNumber += lastDigit;
        }
        System.out.println(binaryNumber);

        scan.close();
    }
}
