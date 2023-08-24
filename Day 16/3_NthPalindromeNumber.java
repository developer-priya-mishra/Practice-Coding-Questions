import java.util.Scanner;

class NthPalindromeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the nth palindrome no : ");
        int num = scan.nextInt();

        for (int i = 1; i <= num; i++) {
            int tempNum = i;
            int remainder = 0;
            int reverse = 0;
            while (tempNum != 0) {
                remainder = tempNum % 10;
                reverse = reverse * 10 + remainder;
                tempNum = tempNum / 10;
            }

            if (reverse == i) {
                System.out.println(reverse);
            }
        }

        scan.close();
    }
}
