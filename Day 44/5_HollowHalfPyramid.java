import java.util.Scanner;

class HollowHalfPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= row; col++) {
                if (row == num || col == 1 || col == row) {
                    System.out.print(col + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        scan.close();
    }
}
