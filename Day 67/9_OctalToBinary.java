import java.util.Scanner;

class OctalToBinary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        int reverseBinary = 0;
        int binaryNumber = 0;

        loop: while (num != 0) {
            int remainder = num % 10;
            if (remainder == 8 || remainder == 9) {
                System.out.println(num + " is invalid octal number");
                binaryNumber = -1;
                break loop;
            } else {
                switch (remainder) {
                    case 0:
                        remainder = 000;
                        break;
                    case 1:
                        remainder = 001;
                        break;
                    case 2:
                        remainder = 010;
                        break;
                    case 3:
                        remainder = 011;
                        break;
                    case 4:
                        remainder = 100;
                        break;
                    case 5:
                        remainder = 101;
                        break;
                    case 6:
                        remainder = 110;
                        break;
                    case 7:
                        remainder = 111;
                        break;
                    default:
                        break;
                }
                reverseBinary = reverseBinary * 1000 + remainder;
                num = num / 10;
            }
        }

        if (binaryNumber != -1) {
            while (reverseBinary != 0) {
                int remainder = reverseBinary % 1000;
                binaryNumber = binaryNumber * 1000 + remainder;
                reverseBinary = reverseBinary / 1000;
            }

            System.out.println("Binary Number is " + binaryNumber);
        }
        scan.close();
    }
}
