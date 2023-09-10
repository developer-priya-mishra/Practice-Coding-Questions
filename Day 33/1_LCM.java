import java.util.Scanner;

// LCM of two number is smallest common multiples divisible by both numbers.
class LCM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int num1 = scan.nextInt();

        System.out.print("Enter the second number : ");
        int num2 = scan.nextInt();

        loop: for (int i = 1; i <= 10; i++) {
            int multiple1 = num1 * i;
            for (int j = 1; j <= 10; j++) {
                int multiple2 = num2 * j;
                if (multiple1 == multiple2) {
                    System.out.println("LCM of " + num1 + " and " + num2 + " is " + multiple2);
                    break loop;
                }
            }
        }

        scan.close();
    }
}
