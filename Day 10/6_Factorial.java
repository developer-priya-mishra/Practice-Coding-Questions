import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        int ans = 1;
        for (int i = 1; i <= num; i++) {
            ans *= i;
        }
        System.out.println("Factorial of " + num + " is " + ans);

        scan.close();
    }
}
