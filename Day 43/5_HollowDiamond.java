import java.util.Scanner;

class HollowDiamond {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        for (int row = num; row >= 1; row--) {
            for (int col = 1; col <= num; col++) {
                if (col == row || col == num) {
                    System.out.print("* ");
                } else {
                    if (col > row) {
                        System.out.print("  ");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }

        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= num; col++) {
                if (col == row || col == num) {
                    System.out.print("* ");
                } else {
                    if (col > row) {
                        System.out.print("  ");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }

        scan.close();
    }
}
