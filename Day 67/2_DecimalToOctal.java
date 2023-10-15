import java.util.Scanner;

class DecimalToOctal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the decimal number : ");
        int num = scan.nextInt();

        StringBuilder octalNumber = new StringBuilder();
        while (num != 0) {
            int remainder = num % 8;
            octalNumber.insert(0, remainder);
            num = num / 8;
        }
        System.out.print("Octal number is " + octalNumber);

        scan.close();
    }
}
