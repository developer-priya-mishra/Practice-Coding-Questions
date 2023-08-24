import java.util.Scanner;

class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        int tempNum = num;
        int remainder = 0;
        int reverse = 0;
        while (tempNum != 0) {
            remainder = tempNum % 10;
            reverse = reverse * 10 + remainder;
            // System.out.print(remainder);
            tempNum = tempNum / 10;
        }

        if (reverse == num) {
            System.out.println(num + " is a Palindrome Number");
        } else {
            System.out.println(num + " is not a Palindrome Number");
        }
        scan.close();
    }
}
