import java.util.Scanner;

class Distance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter x-axis of first point : ");
        float x1 = scan.nextFloat();

        System.out.print("Enter y-axis of first point : ");
        float y1 = scan.nextFloat();

        System.out.print("Enter x-axis of second point : ");
        float x2 = scan.nextFloat();

        System.out.print("Enter y-axis of second point : ");
        float y2 = scan.nextFloat();

        float x = (x2 - x1) * (x2 - x1);
        float y = (y2 - y1) * (y2 - y1);

        float xy = x + y;

        double distance = Math.pow(xy, 0.5);

        System.out.format("Distance between two points are : %.2f cm", distance);
        scan.close();
    }
}
