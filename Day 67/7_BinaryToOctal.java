import java.util.Scanner;

class BinaryToOctal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the binary number : ");
        int binaryNumber = scan.nextInt();

        int reverseOctal[] = new int[100];
        int index = 0;
        while (binaryNumber != 0) {
            int remainder = binaryNumber % 1000;
            switch (remainder) {
                case 0:
                    remainder = 0;
                    break;
                case 1:
                    remainder = 1;
                    break;
                case 10:
                    remainder = 2;
                    break;
                case 11:
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
                default:
                    break;
            }
            reverseOctal[index] = remainder;
            System.out.println(reverseOctal[index]);
            index += 1;
            binaryNumber = binaryNumber / 1000;
        }
        int octalNumber = 0;
        for (int i = index - 1; i >= 0; i--) {
            octalNumber = octalNumber * 10 + reverseOctal[i];
        }
        System.out.println("Octal number is " + octalNumber);
        scan.close();
    }
}
