import java.util.Scanner;

class SumofNaturalNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first natural number : ");
        int num1 = scan.nextInt();
        System.out.print("Enter the second natural number : ");
        int num2 = scan.nextInt();

        int sum = 0;
        for (int i = num1; i <= num2; i++) {
            sum += i;
        }
        System.out.println("Sum of natural numbers from " + num1 + " to " + num2 + " are " + sum);
        scan.close();
    }
}
