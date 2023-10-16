import java.util.Scanner;

class OctalToDecimal1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Octal number : ");
        int octalNumber = scan.nextInt();

        int decimalNumber = 0;
        int power = 0;
        while (octalNumber != 0) {
            int remainder = octalNumber % 10;
            if (remainder == 8 || remainder == 9) {
                System.out.println("Invalid octal number");
                decimalNumber = -1;
                break;
            } else {
                decimalNumber += remainder * Math.pow(8, power);
                power += 1;
                octalNumber = octalNumber / 10;
            }

        }
        if (decimalNumber != -1) {
            System.out.print("Decimal number is " + decimalNumber);
        }

        scan.close();
    }
}

class OctalToDecimal2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Octal number : ");
        String octalNumber = scan.next();

        int decimalNumber = Integer.parseInt(octalNumber, 8);
        System.out.print("Decimal number is " + decimalNumber);

        scan.close();
    }
}