import java.util.Scanner;

class HollowRectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        System.out.println("\u001B[31m");

        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= num * 2; col++) {
                if (row == 1 || row == num || col == 1 || col == num * 2) {
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