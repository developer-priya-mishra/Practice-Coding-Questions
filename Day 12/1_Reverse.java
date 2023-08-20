import java.util.Scanner;

class Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        // int quotient = num;

        while (num % 10 != 0) {
            int remainder = num % 10;
            num = num / 10;
            System.out.print(remainder);
        }

        scan.close();
    }
}