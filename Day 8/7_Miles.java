import java.util.Scanner;

class Miles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter distance in km : ");
        double distanceInKM = scan.nextDouble();

        double distanceInMiles = distanceInKM * 0.621371;

        System.out.format("Km to miles is " + "%.3f", distanceInMiles);

        scan.close();
    }
}
