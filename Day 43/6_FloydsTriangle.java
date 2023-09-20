import java.util.Scanner;

class FloydsTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        int j = 1;
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(j + "  ");
                j = j + 1;
            }
            System.out.println();
        }

        scan.close();
    }
}
