import java.util.Scanner;

class HollowNumberHalfPyramid1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        int j = 1;
        for (int row = num; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                if (row == num) {
                    System.out.print(col + " ");
                } else if (row == col) {
                    System.out.print(num + " ");
                } else if (col == 1) {
                    System.out.print(j + " ");
                } else {
                    System.out.print("  ");
                }
            }
            j = j + 1;
            System.out.println();
        }

        scan.close();
    }
}

class HollowNumberHalfPyramid2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        for (int row = num; row >= 1; row--) {
            int j = num - row + 1;
            for (int col = 1; col <= row; col++) {
                if (row == num || row == col || col == 1) {
                    System.out.print(j + " ");
                } else {
                    System.out.print("  ");
                }
                j = j + 1;
            }
            System.out.println();
        }

        scan.close();
    }
}