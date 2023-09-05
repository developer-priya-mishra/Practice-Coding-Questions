import java.util.Scanner;

// Special number is a no if the sum of the factorial of the digits in the number is equal to the number itself. 

class SpecialNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        int sum = 0;
        int tempNum = num;
        while (tempNum != 0) {
            int remainder = tempNum % 10;
            int factorial = 1;
            for (int i = 1; i <= remainder; i++) {
                factorial *= i;
            }
            sum += factorial;
            tempNum = tempNum / 10;
        }

        if (num == sum) {
            System.out.println(num + " is a Special Number");
        } else {
            System.out.println(num + " is not a Special Number");
        }
        scan.close();
    }
}
