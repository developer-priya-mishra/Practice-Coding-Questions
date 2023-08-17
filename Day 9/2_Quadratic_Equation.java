import java.util.Scanner;

class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the coefficient of x^2 : ");
        int a = scan.nextInt();

        System.out.print("Enter the coefficient of x : ");
        int b = scan.nextInt();

        System.out.print("Enter the constant : ");
        int c = scan.nextInt();

        double discriminant = Math.pow((b * b) - (4 * a * c), 1.0 / 2);

        double root1 = (-b + discriminant) / (2.0 * a);
        double root2 = (-b - discriminant) / (2.0 * a);

        System.out.println("Solution of quadratic equation is \n" + "root1 = " + root1 + " root2 = " + root2);

        scan.close();
    }
}
