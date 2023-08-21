import java.util.Scanner;

class CountDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        int number = num;
        int count = 0;
        while (number % 10 != 0) {
            count = count + 1;
            number = number / 10;
        }
        System.out.println("Number of digits in " + num + " is " + count);

        scan.close();
    }
}