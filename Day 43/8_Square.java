import java.util.Scanner;

class Square {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of rows : ");
        int numRow = scan.nextInt();

        System.out.print("Enter the number of columns : ");
        int numCol = scan.nextInt();

        if (numRow <= 1 || numCol <= 1) {
            System.out.println("Number should be greater than 2");
        } else if (numCol == numRow) {
            for (int row = 1; row <= numRow; row++) {
                for (int col = 1; col <= numCol; col++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Number of columns should be equal to number of rows.");
        }

        scan.close();
    }
}
