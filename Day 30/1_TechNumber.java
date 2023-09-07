import java.util.Scanner;

// A number is said to be a tech number, when an even digit number is divided into exactly two parts and the square value of the sum of those two numbers is equal to the original number.
class TechNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        int tempNum = num;
        int count = 0;
        while (tempNum != 0) {
            count += 1;
            tempNum = tempNum / 10;
        }

        if (count % 2 == 0) {
            int firstHalfPart = num;
            int reverse = 0;
            for (int i = 1; i <= (count / 2); i++) {
                int remainder = firstHalfPart % 10;
                reverse = reverse * 10 + remainder;
                firstHalfPart = firstHalfPart / 10;
            }

            int secondHalfPart = 0;
            while (reverse != 0) {
                int remainder = reverse % 10;
                secondHalfPart = secondHalfPart * 10 + remainder;
                reverse = reverse / 10;
            }

            int techNum = (int) Math.pow(firstHalfPart + secondHalfPart, 2);
            if (techNum == num) {
                System.out.println(num + " is a Tech number");
            } else {
                System.out.println(num + " is not a Tech number");
            }
        } else {
            System.out.println("Enter the even digit no");
        }

        scan.close();
    }
}