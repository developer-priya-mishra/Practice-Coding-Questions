import java.util.Scanner;

class FibonacciSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the term : ");
        int n = scan.nextInt();

        int prev = 0;
        int curr = 1;

        System.out.print("Fibonacci Sequence: " + prev + " " + curr);

        for (int i = 2; i < n; i++) {
            int next = prev + curr;
            System.out.print(" " + next);
            prev = curr;
            curr = next;
        }
        scan.close();
    }
}
