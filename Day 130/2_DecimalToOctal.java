import java.util.Scanner;

class DecimalToOctal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the decimal number : ");
        int decimalNumber = scan.nextInt();

        int reverseOctalNumber[] = new int[decimalNumber];
        int index = 0;
        while (decimalNumber != 0) {
            int remainder = decimalNumber % 8;
            reverseOctalNumber[index] = remainder;
            index++;
            decimalNumber = decimalNumber / 8;
        }

        int octalNumber = 0;
        for (int i = index - 1; i >= 0; i--) {
            octalNumber = octalNumber * 10 + reverseOctalNumber[i];
        }

        System.out.println("Octal Number " + octalNumber);
        scan.close();
    }
}
