import java.util.Scanner;

class BinaryToDecimal1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the binary number : ");
        int binaryNumber = scan.nextInt();

        double power = 0;
        int decimalNumber = 0;
        while (binaryNumber != 0) {
            int remainder = binaryNumber % 10;
            decimalNumber += remainder * Math.pow(2, power);
            power += 1;
            binaryNumber = binaryNumber / 10;
        }

        System.out.print("Decimal number is " + decimalNumber);
        scan.close();
    }
}

class BinaryToDecimal2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the binary number : ");
        String binaryNumber = scan.next();

        int decimalNumber = Integer.parseInt(binaryNumber, 2);

        System.out.print("Decimal number is " + decimalNumber);
        scan.close();
    }
}
