import java.util.Scanner;

class CountNoOfDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        int temp = num;
        int count = 0;
        while (temp != 0) {
            count += 1;
            temp = temp / 10;
        }

        System.out.print("Number of digits in " + num + " is " + count);
        scan.close();
    }
}