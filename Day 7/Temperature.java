import java.util.Scanner;

class Temperature {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the celsius : ");
        float celsius = scan.nextFloat();

        double fahrenheit = (celsius * (9.0 / 5)) + 32;

        System.out.println("Fahrenheit : " + fahrenheit);
        scan.close();
    }
}