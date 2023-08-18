import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        int table = 1;
        for (int i = 1; i <= 10; i++) {
            table = num * i;
            System.out.println(table);
        }

        scan.close();
    }
}
