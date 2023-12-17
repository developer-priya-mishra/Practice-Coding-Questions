import java.util.Scanner;

class OctalToBinary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the octal number : ");
        int octalNumber = scan.nextInt();

        String lastDigit = "";
        String reverseBinarylNumber[] = new String[100];
        int index = 0;
        while (octalNumber != 0) {
            int remainder = octalNumber % 10;
            if (octalNumber == 8 && octalNumber == 9) {
                System.out.print(octalNumber + " is not octal number.");
            } else {
                switch (remainder) {
                    case 0:
                        lastDigit = "000";
                        break;
                    case 1:
                        lastDigit = "001";
                        break;
                    case 2:
                        lastDigit = "010";
                        break;
                    case 3:
                        lastDigit = "011";
                        break;
                    case 4:
                        lastDigit = "100";
                        break;
                    case 5:
                        lastDigit = "101";
                        break;
                    case 6:
                        lastDigit = "110";
                        break;
                    case 7:
                        lastDigit = "111";
                        break;
                    default:
                        break;
                }
            }
            reverseBinarylNumber[index] = lastDigit;
            index++;
            octalNumber = octalNumber / 10;
        }

        String binaryNumber = "";
        for (int i = index - 1; i >= 0; i--) {
            binaryNumber += reverseBinarylNumber[i];
        }

        System.out.print("Decimal Number is " + binaryNumber);

        scan.close();
    }
}
