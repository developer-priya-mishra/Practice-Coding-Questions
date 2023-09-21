import java.util.Scanner;

class HollowNumberFullPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        int j = 1;
        for (int row = num; row >= 1; row--) {
            for (int col = 1; col <= num; col++) {
                if (col >= row) {
                    System.out.print(j + " ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

        scan.close();
    }
}
