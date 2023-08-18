import java.util.Scanner;

class SwapNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int num1 = scan.nextInt();

        System.out.print("Enter the second number : ");
        int num2 = scan.nextInt();

        int temp = 0;

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After swapping");
        System.out.println("First number : " + num1);
        System.out.println("Seconf number : " + num2);

        scan.close();
    }
}
