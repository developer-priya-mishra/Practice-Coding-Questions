import java.util.Scanner;

// Buzz numbers are those numbers that are divisible by seven or end with seven for example, 57, 28.
class BuzzNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        if (num % 7 == 0 || num % 10 == 7) {
            System.out.println(num + " is a Buzz number");
        } else {
            System.out.println(num + " is not a Buzz number");
        }

        scan.close();
    }
}
