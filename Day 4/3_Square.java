import java.util.Scanner;

class Square {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the side of square : ");
        float side = scan.nextFloat();

        float area = side * side;
        System.out.println("Area of sqaure : " + area);

        float perimeter = 4 * side;
        System.out.println("Perimeter of square : " + perimeter);

        scan.close();
    }
}