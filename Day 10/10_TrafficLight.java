import java.util.Scanner;

class TrafficLight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String light = scan.nextLine();

        switch (light) {
            case "Red":
                System.out.println("Stop the vehicle");
                break;

            case "Yellow":
                System.out.println("Wait");
                break;

            case "Green":
                System.out.println("Go");

            default:
                break;
        }

        scan.close();
    }
}
