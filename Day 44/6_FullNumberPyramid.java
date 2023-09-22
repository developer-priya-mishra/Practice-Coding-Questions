import java.util.Scanner;

class FullNumberPyramid1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        int j = 0;
        int colEnd = num;
        for (int row = num; row >= 1; row--) {
            for (int col = 1; col <= colEnd; col++) {
                if (row <= col) {
                    if (col > num) {
                        j = j - 1;
                    } else {
                        j = j + 1;
                    }
                    System.out.print(j + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
            colEnd++;
        }
        scan.close();
    }
}

class FullNumberPyramid2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        int j = 0;
        for (int row = num; row >= 1; row--) {
            for (int col = 1; col <= (num - row) + num; col++) {
                if (row <= col) {
                    if (col > num) {
                        j = j - 1;
                    } else {
                        j = j + 1;
                    }
                    System.out.print(j + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        scan.close();
    }
}
