import java.util.Scanner;

// Pronic number is a number which is the product of two consecutive integers. Eg, n = x * (x+1).
class PronicNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        boolean isPronicNumber = false;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                if (i * (i + 1) == num) {
                    isPronicNumber = true;
                    break;
                }
            }
        }
        if (isPronicNumber) {
            System.out.println(num + " is a Pronic Number");
        } else {
            System.out.println(num + " is not a Pronic Number");
        }

        scan.close();
    }
}