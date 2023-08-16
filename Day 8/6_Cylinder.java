import java.util.Scanner;

class Cylinder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the height of cylinder in cm : ");
        double height = scan.nextDouble();

        System.out.print("Enter the radius of cylinder im cm : ");
        double radius = scan.nextDouble();

        double totalSurfaceArea = 2 * (22.0 / 7.0) * radius * (height + radius);

        System.out.format("Total surface area of cylinder : " + "%.2f", totalSurfaceArea);

        scan.close();
    }
}
