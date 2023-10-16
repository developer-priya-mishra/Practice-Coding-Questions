import java.util.Scanner;

class DecimalToOctal1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the decimal number : ");
        int decimalNumber = scan.nextInt();

        int reverseOctalNumber[] = new int[100];
        int index = 0;
        while (decimalNumber != 0) {
            int remainder = decimalNumber % 8;
            reverseOctalNumber[index] = remainder;
            decimalNumber = decimalNumber / 8;
            index += 1;
        }

        int octalNumber = 0;
        for (int i = index - 1; i >= 0; i--) {
            octalNumber = octalNumber * 10 + reverseOctalNumber[i];
        }
        System.out.print("Octal number is " + octalNumber);

        scan.close();
    }
}

class DecimalToOctal2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the decimal number : ");
        int decimalNumber = scan.nextInt();

        StringBuilder octalNumber = new StringBuilder();
        while (decimalNumber != 0) {
            int remainder = decimalNumber % 8;
            octalNumber.insert(0, remainder);
            decimalNumber = decimalNumber / 8;
        }
        System.out.print("Octal number is " + octalNumber);

        scan.close();
    }
}

class DecimalToOctal3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the decimal number : ");
        int decimalNumber = scan.nextInt();

        String octalNumber = Integer.toOctalString(decimalNumber);

        System.out.print("Octal number is " + octalNumber);

        scan.close();
    }
}