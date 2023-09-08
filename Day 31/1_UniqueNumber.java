import java.util.Scanner;

// Unique number can be defined as a number which does not have a single repeated digit in it.
class UniqueNumber1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        boolean isUniqueNumber = true;
        int tempNum1 = num;
        loop1: while (tempNum1 != 0) {
            int remainder1 = tempNum1 % 10;
            tempNum1 = tempNum1 / 10;
            int tempNum2 = tempNum1;
            while (tempNum2 != 0) {
                int remainder2 = tempNum2 % 10;
                if (remainder1 == remainder2) {
                    isUniqueNumber = false;
                    break loop1;
                }
                tempNum2 = tempNum2 / 10;
            }
            // if (!isUniqueNumber) {
            // break;
            // }
        }

        if (isUniqueNumber) {
            System.out.println(num + " is a unique number");
        } else {
            System.out.println(num + " is not a unique number");
        }

        scan.close();
    }
}

class UniqueNumber2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        boolean isUniqueNumber = true;
        int tempNum1 = num;

        loop1: while (tempNum1 != 0) {
            int remainder1 = tempNum1 % 10;
            tempNum1 = tempNum1 / 10;
            int count = 0;
            int tempNum2 = num;
            while (tempNum2 != 0) {
                int remainder2 = tempNum2 % 10;
                if (remainder1 == remainder2) {
                    count++;
                }
                tempNum2 = tempNum2 / 10;
            }
            if (count > 1) {
                isUniqueNumber = false;
                break loop1;
            }
        }

        if (isUniqueNumber) {
            System.out.println(num + " is a unique number");
        } else {
            System.out.println(num + " is not a unique number");
        }

        scan.close();
    }
}