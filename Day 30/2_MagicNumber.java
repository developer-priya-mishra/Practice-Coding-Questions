import java.util.Scanner;

// In Magic number, we sum up all the digits of the number recursively until we get a signal digit i.e., 1.
class MagicNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        int tempNum = num;
        while (tempNum > 9) {
            tempNum = isMagic(tempNum);
        }

        if (tempNum == 1) {
            System.out.println(num + " is a Magic number");
        } else {
            System.out.println(num + " is not a Magic number");
        }

        scan.close();
    }

    static int isMagic(int num) {
        int sum = 0;
        while (num != 0) {
            int remainder = num % 10;
            sum += remainder;
            num = num / 10;
        }
        return sum;
    }
}
