import java.util.Scanner;

class Triangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first side : ");
        float s1 = scan.nextFloat();

        System.out.print("Enter second side : ");
        float s2 = scan.nextFloat();

        System.out.print("Enter third side : ");
        float s3 = scan.nextFloat();

        if (s1 == s2 && s2 == s3 && s1 == s3) {
            System.out.println("This is equilateral triangle");
        } else if (s1 == s2 || s1 == s3 || s2 == s3) {
            System.out.println("This is isosceles triangle");
        } else if (s1 * s1 == s2 * s2 + s3 * s3 || s2 * s2 == s1 * s1 + s3 * s3 || s3 * s3 == s2 * s2 + s1 * s1) {
            System.out.println("This is right angle triangle");
        } else {
            System.out.println("This is scalene triangle");
        }

        scan.close();
    }
}
