import java.util.Scanner;

class ArithmeticProgression {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first term : ");
        int a1 = scan.nextInt();

        System.out.print("Enter second term : ");
        int a2 = scan.nextInt();

        System.out.print("Enter nth term of AP : ");
        int n = scan.nextInt();

        int d = a2 - a1;

        int ArithmeticProgression = a1 + ((n - 1) * d);
        System.out.println("Arithmetic Progression is : " + ArithmeticProgression);

        scan.close();

    }
}
