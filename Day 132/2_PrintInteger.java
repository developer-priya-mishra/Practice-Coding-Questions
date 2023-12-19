import java.util.Scanner;

class PrintInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the integer : ");
        int num = scan.nextInt();

        System.out.print("Integer is " + num);
        scan.close();
    }
}
