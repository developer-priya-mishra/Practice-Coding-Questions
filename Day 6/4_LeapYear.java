import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the year : ");
        int num = scan.nextInt();

        if (num % 4 == 0 && num % 100 != 0) {
            System.out.println(num + " is a leap year");
        } else if (num % 400 == 0) {
            System.out.println(num + " is a leap year");
        } else {
            System.out.println(num + " is not a leap year");
        }

        scan.close();
    }
}
