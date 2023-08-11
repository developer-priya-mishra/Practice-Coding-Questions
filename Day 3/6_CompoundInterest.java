import java.util.Scanner;

class CompoundInterest {
    public static void main(String[] args) {
        float principal, rate, time;
        float compondInterest;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the principal : ");
        principal = scan.nextFloat();

        System.out.print("Enter the rate : ");
        rate = scan.nextFloat();

        System.out.print("Enter the time : ");
        time = scan.nextFloat();

        float y = (1 + (rate / 100));
        float z = 1;

        for (int i = 1; i <= time; i++) {
            z *= y;
        }
        compondInterest = principal * z;
        System.out.println("Compound Interest : " + compondInterest);
        scan.close();
    }
}
