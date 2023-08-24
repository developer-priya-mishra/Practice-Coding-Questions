import java.util.Scanner;

class PrintPalindromeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int num1 = scan.nextInt();

        System.out.print("Enter the second number : ");
        int num2 = scan.nextInt();

        for (int i = num1; i <= num2; i++) {
            int tempNum = i;
            int remainder = 0;
            int reverse = 0;
            while (tempNum != 0) {
                remainder = tempNum % 10;
                reverse = reverse * 10 + remainder;
                tempNum = tempNum / 10;
            }
            // System.out.println(reverse);
            if (reverse == i) {
                System.out.println(reverse);
            }
        }

        scan.close();
    }
}
