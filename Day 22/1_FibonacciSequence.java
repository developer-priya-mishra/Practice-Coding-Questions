import java.util.Scanner;

class FibonacciSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the term : ");
        int n = scan.nextInt();

        int term1 = 0;
        int term2 = 1;

        System.out.print("Fibonacci Sequence: " + term1 + " " + term2);

        for (int i = 2; i < n; i++) {
            int nextTerm = term1 + term2;
            System.out.print(" " + nextTerm);
            term1 = term2;
            term2 = nextTerm;
        }
        scan.close();
    }
}
