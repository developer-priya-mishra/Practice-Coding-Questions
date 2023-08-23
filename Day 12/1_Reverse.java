import java.util.Scanner;

//1st way to reverse a number
class Reverse1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        // int quotient = num;
        int remainder = 0;
        while (num != 0) {
            remainder = num % 10;
            num = num / 10;
            System.out.print(remainder);
        }

        scan.close();
    }
}

// 2nd way to reverse a number

class Reverse2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        int reverseNum = 0;

        while (num != 0) {
            int remainder = num % 10;
            reverseNum = (reverseNum * 10) + remainder;
            num = num / 10;
        }
        System.out.print(reverseNum);

        scan.close();
    }
}

// 3rd way to reverse a number
class Reverse3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        int reverseNum = 0;

        while (num != 0) {
            reverseNum = (reverseNum * 10) + num % 10;
            num = num / 10;
        }
        System.out.print(reverseNum);

        scan.close();
    }
}