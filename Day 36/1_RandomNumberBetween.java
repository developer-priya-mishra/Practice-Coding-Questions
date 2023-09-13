import java.util.Scanner;

class RandomNumberBetween {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the maximum number: ");
        int max = scan.nextInt();

        System.out.print("Enter the minimum number: ");
        int min = scan.nextInt();

        System.out.println("Random number between two numbers are " + (int) (Math.random() * (max - min + 1) + min));

        scan.close();
    }
}