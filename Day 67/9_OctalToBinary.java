import java.util.Scanner;

class OctalToBinary1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int octalNumber = scan.nextInt();

        int reverseBinary[] = new int[100];
        int index = 0;

        while (octalNumber != 0) {
            int remainder = octalNumber % 10;
            switch (remainder) {
                case 0:
                    remainder = 0;
                    break;
                case 1:
                    remainder = 1;
                    break;
                case 2:
                    remainder = 10;
                    break;
                case 3:
                    remainder = 11;
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
            reverseBinary[index] = remainder;
            octalNumber = octalNumber / 10;
            index += 1;
        }

        int binaryNumber = 0;
        for (int i = index - 1; i >= 0; i--) {
            binaryNumber = binaryNumber * 1000 + reverseBinary[i];
        }
        System.out.println("Binary Number is " + binaryNumber);

        scan.close();
    }
}

class OctalToBinary2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int octalNumber = scan.nextInt();

        StringBuilder binaryNumber = new StringBuilder();
        while (octalNumber != 0) {
            String remainder = Integer.toString(octalNumber % 10);
            switch (remainder) {
                case "0":
                    remainder = "000";
                    break;
                case "1":
                    remainder = "001";
                    break;
                case "2":
                    remainder = "010";
                    break;
                case "3":
                    remainder = "011";
                    break;
                case "4":
                    remainder = "100";
                    break;
                case "5":
                    remainder = "101";
                    break;
                case "6":
                    remainder = "110";
                    break;
                case "7":
                    remainder = "111";
                    break;
                default:
                    break;
            }
            binaryNumber.insert(0, remainder);
            octalNumber = octalNumber / 10;
        }

        System.out.println("Binary Number is " + binaryNumber);
        scan.close();
    }
}

class OctalToBinary3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        String octalNumber = scan.next();

        int decimalNumber = Integer.parseInt(octalNumber, 8);
        String binaryNumber = Integer.toBinaryString(decimalNumber);
        System.out.println("Binary Number is " + binaryNumber);
        scan.close();
    }
}
