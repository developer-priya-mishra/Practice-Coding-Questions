import java.util.Scanner;

class KrishnmurtiNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        int temp = num;
        int number = 0;
        while (temp != 0) {
            int factorial = 1;
            int lastDigit = temp % 10;
            for (int i = 2; i <= lastDigit; i++) {
                factorial *= i;
            }
            number += factorial;
            temp = temp / 10;
        }

        if (num == number) {
            System.out.println(num + " is a Krishnmurti Number");
        } else {
            System.out.println(num + " is not a Krishnmurti Number");
        }
        scan.close();
    }
}