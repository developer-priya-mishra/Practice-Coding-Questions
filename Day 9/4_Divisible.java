import java.util.Scanner;

class Divisible {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int num1 = scan.nextInt();

        System.out.print("Enter the second number : ");
        int num2 = scan.nextInt();

        if (num1 % num2 == 0) {
            System.out.println("Number 1 is divisible by number 2");
        } else {
            System.out.println("Number 1 is not divisible by number 2");
        }

        scan.close();
    }
}
