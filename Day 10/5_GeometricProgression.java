import java.util.Scanner;

class GeometricProgression {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first term : ");
        int a1 = scan.nextInt();

        System.out.print("Enter second term : ");
        int a2 = scan.nextInt();

        System.out.print("Enter nth term of GP : ");
        int n = scan.nextInt();

        int commonRatio = a2 / a1;

        double GeometricProgression = a1 * (Math.pow(commonRatio, (n - 1)));
        System.out.println("Geometric Progression is : " + GeometricProgression);

        scan.close();

    }
}
