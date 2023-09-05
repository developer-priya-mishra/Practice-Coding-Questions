import java.util.Scanner;

// A Duck number is a positive number which has zeroes present in it, For example 3210
class DuckNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        boolean isDuckNumber = false;
        int tempNum = num;
        while (tempNum != 0) {
            int remainder = tempNum % 10;
            tempNum = tempNum / 10;
            if (remainder == 0) {
                isDuckNumber = true;
                break;
            }
        }

        if (isDuckNumber) {
            System.out.println(num + " is a Duck number");
        } else {
            System.out.println(num + " is not a Duck number");
        }

        scan.close();
    }
}
