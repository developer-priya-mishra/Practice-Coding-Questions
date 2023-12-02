import java.util.Scanner;

class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        int temp1 = num;
        int count = 0;
        while (temp1 != 0) {
            count += 1;
            temp1 = temp1 / 10;
        }

        int temp2 = num;
        int number = 0;
        while (temp2 != 0) {
            int lastDigit = temp2 % 10;
            number += Math.pow(lastDigit, count);
            temp2 = temp2 / 10;
        }

        if (num == number) {
            System.out.println(num + " is an Armstrong Number");
        } else {
            System.out.println(num + " is not an Armstrong Number");
        }

        scan.close();
    }
}
