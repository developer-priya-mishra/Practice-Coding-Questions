import java.util.Scanner;

class HollowInvertedTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        for (int row = num; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                if (row == num || col == 1 || col == row) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("\u001B[0m");

        scan.close();
    }
}