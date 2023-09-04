import java.util.Scanner;

class MultiplyOfDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        int number = num;
        int reverseNum = 0;
        int multiplyOfNumber = 1;
        while (number != 0) {
            reverseNum = number % 10;
            multiplyOfNumber *= reverseNum;
            number = number / 10;
        }
        System.out.println("Multiply of " + num + " digits are : " + multiplyOfNumber);
        scan.close();
    }
}
