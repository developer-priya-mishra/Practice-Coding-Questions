import java.util.Scanner;

class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        int temp = num;
        int reverseNumber = 0;
        while (temp != 0) {
            int lastDigit = temp % 10;
            reverseNumber = reverseNumber * 10 + lastDigit;
            temp = temp / 10;
        }

        if (num == reverseNumber) {
            System.out.print(num + " is a Palindrome number");
        } else {
            System.out.print(num + " is not a Palindrome number");
        }

        scan.close();
    }
}
