import java.util.Scanner;

class Temperature {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the celsius : ");
        float c = scan.nextFloat();

        float f = (c * (9 / 5)) + 32;
        System.out.println("Fahrenheit : " + f);
        scan.close();
    }
}