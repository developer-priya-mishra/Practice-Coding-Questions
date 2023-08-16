import java.util.Scanner;

class Time {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the milisecond : ");
        double milliSecond = scan.nextDouble();

        double second = milliSecond / 1000;
        int minute = (int) second / 60;

        System.out.format("Time is " + minute + " minute " + "%.2f second", second);

        scan.close();
    }
}
