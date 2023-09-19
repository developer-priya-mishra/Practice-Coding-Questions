import java.util.Scanner;

class HollowRightAngleTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= row; col++) {
                // Print at first col , last col and last row.
                if (col == 1 || col == row || row == num) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        scan.close();
    }
}
