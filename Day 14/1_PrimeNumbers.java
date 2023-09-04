import java.util.Scanner;

class PrimeNumbers1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count = count + 1;
            }
        }

        if (count == 2) {
            System.out.println(num + " is  a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
        scan.close();
    }
}
