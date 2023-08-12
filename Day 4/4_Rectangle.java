import java.util.Scanner;

class Rectangle {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.print("Enter the length of rectangle : ");
        float length = scan.nextFloat();

        System.out.print("Enter the breadth of rectangle : ");
        float breadth = scan.nextFloat();

        float area= length*breadth;
        System.out.println("Area of rectangle : "+area);

        float perimeter = 2*(length+breadth);
        System.out.println("Perimeter of rectangle : "+perimeter);

        scan.close();
    }
}
