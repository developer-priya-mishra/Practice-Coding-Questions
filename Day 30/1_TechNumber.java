import java.util.Scanner;

class TechNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        int number = num;
        int count = 0;
        while (number != 0) {
            count += 1;
            number = number / 10;
        }

        if (count % 2 == 0) {
            number = num;
            int reverse = 0;
            for (int i = 1; i <= (count / 2); i++) {
                int remainder = number % 10;
                reverse = reverse * 10 + remainder;
                number = number / 10;
            }

            int tempNum = 0;
            while (reverse != 0) {
                int remainder = reverse % 10;
                tempNum = tempNum * 10 + remainder;
                reverse = reverse / 10;
            }

            int techNum = (int) Math.pow(number + tempNum, 2);
            if (techNum == num) {
                System.out.println(num + " is a Tech number");
            } else {
                System.out.println(num + " is not a Tech number");
            }
        } else {
            System.out.println("Enter the even digit prime no");
        }

        scan.close();
    }
}