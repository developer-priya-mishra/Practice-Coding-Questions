import java.util.Scanner;

class DecimalToOctal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the decimal number : ");
        int num = scan.nextInt();

        int reverseOctalNumber[] = new int[100];
        int index = 0;
        while (num != 0) {
            int remainder = num % 8;
            reverseOctalNumber[index] = remainder;
            num = num / 8;
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
