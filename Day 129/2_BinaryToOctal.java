import java.util.Scanner;

class BinaryToOctal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the binary number : ");
        int binaryNumber = scan.nextInt();

        int reverseOctalNumber = 0;
        while (binaryNumber != 0) {
            int remainder = binaryNumber % 1000;
            switch (remainder) {
                case 000:
                    remainder = 0;
                    break;

                case 001:
                    remainder = 1;
                    break;

                case 010:
                    remainder = 2;
                    break;

                case 011:
                    remainder = 3;
                    break;

                case 100:
                    remainder = 4;
                    break;

                case 101:
                    remainder = 5;
                    break;

                case 110:
                    remainder = 6;
                    break;

                case 111:
                    remainder = 7;
                    break;
            }
            reverseOctalNumber = reverseOctalNumber * 10 + remainder;
            binaryNumber = binaryNumber / 1000;
        }

        int octalNumber = 0;
        while (reverseOctalNumber != 0) {
            int remainder = reverseOctalNumber % 10;
            octalNumber = octalNumber * 10 + remainder;
            reverseOctalNumber = reverseOctalNumber / 10;
        }

        System.out.println("Octal Number is " + octalNumber);
        scan.close();
    }
}
