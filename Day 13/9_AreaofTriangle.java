import java.util.Scanner;

class AreaofTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first side of triangle : ");
        float side1 = scan.nextFloat();

        System.out.print("Enter the second side of triangle : ");
        float side2 = scan.nextFloat();

        System.out.print("Enter the third side of triangle : ");
        float side3 = scan.nextFloat();

        float s = (side1 + side2 + side3) / 2;

        double result = s * (s - side1) * (s - side2) * (s - side3);
        double areaofTriangle = Math.pow(result, 1.0 / 2.0);
        System.out.format("Area of triangle is %.2f", areaofTriangle);

        scan.close();
    }
}
