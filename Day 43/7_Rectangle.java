import java.util.Scanner;

class Rectangle1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of rows : ");
        int numRow = scan.nextInt();

        System.out.print("Enter the number of columns : ");
        int numCol = scan.nextInt();

        if (numRow <= 1 || numCol <= 1) {
            System.out.println("Number should be greater than 2");
        } else if (numCol > numRow) {
            for (int row = 1; row <= numRow; row++) {
                for (int col = 1; col <= numCol; col++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Number of columns should be greater than number of rows.");
        }

        scan.close();
    }
}

class Rectangle2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= num * 2; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        scan.close();
    }
}