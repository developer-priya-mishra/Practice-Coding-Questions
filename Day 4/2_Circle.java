import java.util.Scanner;

class Circle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the radius of circle : ");
        float radius = scan.nextFloat();

        float area = (22 * radius * radius) / 7;

        System.out.println("Area of circle : " + area);

        float circumference = (2 * 22 * radius) / 7;

        System.out.println("Circumference of circle : " + circumference);
        scan.close();

    }
}
