import java.util.Scanner;

class HollowNumberFullPyramid1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        for (int row = num; row >= 1; row--) {
            int j = 0;
            for (int col = 1; col <= num; col++) {
                if (col == row || col == num || row == 1) {
                    j = j + 1;
                    System.out.print(j + " ");
                } else {
                    if (col > row) {
                        j = j + 1;
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

class HollowNumberFullPyramid2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        for (int row = num; row >= 1; row--) {
            int j = 1;
            for (int col = 1; col <= num; col++) {
                if (col == row) {
                    System.out.print(j + "_");
                } else if (col > row) {
                    System.out.print(j + 1 + "_");
                    j = j + 1;
                } else {
                    System.out.print("_");
                }
            }
            System.out.println();
        }
        scan.close();
    }
}
