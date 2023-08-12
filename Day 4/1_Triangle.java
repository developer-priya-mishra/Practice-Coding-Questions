import java.util.Scanner;

class AreaTri{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.print("Enter the base of triangle : ");
        float base=scan.nextFloat();

        System.out.print("Enter the height of triangle : ");
        float height=scan.nextFloat();
        
        float area = (1*base*height)/2;

        System.out.println("Area of triangle : "+area);
        scan.close();
    }
}