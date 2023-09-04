import java.util.Scanner;

class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        int tempNum = num;
        int reverseNum = 0;
        while (tempNum != 0) {
            int remainder = tempNum % 10;
            reverseNum = reverseNum * 10 + remainder;
            tempNum = tempNum / 10;
        }

        if (reverseNum == num) {
            System.out.println(num + " is a Palindrome Number");
        } else {
            System.out.println(num + " is not a Palindrome Number");
        }
        scan.close();
    }
}
