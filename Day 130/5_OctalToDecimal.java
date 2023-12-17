import java.util.Scanner;

class OctalToDecimal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the octal number : ");
        int octalNumber = scan.nextInt();

        int count = 0;
        int decimalNumber = 0;
        while (octalNumber != 0) {
            int remainder = octalNumber % 10;
            decimalNumber += remainder * (Math.pow(8, count));
            octalNumber = octalNumber / 10;
            count++;
        }

        System.out.println("Decimal Number : " + decimalNumber);

        scan.close();
    }
}
