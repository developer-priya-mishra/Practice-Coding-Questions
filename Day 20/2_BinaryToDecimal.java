import java.util.Scanner;

class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the binary number : ");
        int num = scan.nextInt();

        int reverse = num;
        int count = 0;
        while (num != 0) {
            count += 1;
            num = num / 10;
        }

        int decimalNumber = 0;
        for (int i = 0; i < count; i++) {
            decimalNumber += (reverse % 10) * Math.pow(2, i);
            reverse = reverse / 10;
        }
        System.out.println("Decimal number : " + decimalNumber);
        scan.close();
    }
}
