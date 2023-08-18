import java.util.Scanner;

class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the nth term : ");
        int n = scan.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of first " + n + " natural numbers are : " + sum);

        scan.close();
    }
}

// Efficient solution for above code is using Arithmetic Progression

class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the nth term : ");
        int n = scan.nextInt();

        int sum = (n * (n + 1)) / 2;

        System.out.println("Sum of first " + n + " natural numbers are : " + sum);

        scan.close();
    }
}
