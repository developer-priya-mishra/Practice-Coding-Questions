import java.util.Scanner;

// Pyramid or Equilateral triangle
class Pyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        for (int row = num; row >= 1; row--) {
            for (int col = 1; col <= num; col++) {
                if (row <= col) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        scan.close();
    }
}