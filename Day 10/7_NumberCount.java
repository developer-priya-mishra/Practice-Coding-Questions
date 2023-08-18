import java.util.Scanner;

class NumberCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int num1 = scan.nextInt();

        System.out.println("Enter the number : ");
        int num2 = scan.nextInt();

        int count1 = num1 % 10;
        int count2 = num2 % 10;

        if (count1 == count2) {
            System.out.println("Numbers have same last digit");
        } else {
            System.out.println("Numbers do not have same last digit");
        }
        scan.close();
    }
}
