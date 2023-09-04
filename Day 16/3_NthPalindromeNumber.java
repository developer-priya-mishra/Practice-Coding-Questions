import java.util.Scanner;

class NthPalindromeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the nth palindrome no : ");
        int num = scan.nextInt();

        for (int i = 1; i <= num; i++) {
            int tempNum = i;
            int reverseNum = 0;
            while (tempNum != 0) {
                int remainder = tempNum % 10;
                reverseNum = reverseNum * 10 + remainder;
                tempNum = tempNum / 10;
            }

            if (reverseNum == i) {
                System.out.println(reverseNum);
            }
        }

        scan.close();
    }
}
