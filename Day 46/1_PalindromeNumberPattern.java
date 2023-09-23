import java.util.Scanner;

class NumberPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        int colEnd = 1;
        for (int row = 1; row <= num; row++) {
            int j = row - 1;
            for (int col = 1; col <= colEnd; col++) {
                if (row >= col) {
                    System.out.print(col + " ");
                } else {
                    System.out.print(j + " ");
                    j = j - 1;
                }
            }
            System.out.println();
            colEnd = colEnd + 2;
        }
        scan.close();
    }
}
