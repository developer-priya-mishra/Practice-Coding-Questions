import java.util.Scanner;

class DigitToWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        int tempNum = num;
        int reverse = 0;
        int count = 0;
        while (tempNum != 0) {
            count += 1;
            tempNum = tempNum / 10;
        }

        tempNum = num;
        while (tempNum != 0) {
            int remainder1 = tempNum % 10;
            reverse = reverse * 10 + remainder1;
            tempNum = tempNum / 10;
        }

        System.out.println(reverse);
        for (int i = 1; i <= count; i++) {
            int remainder2 = reverse % 10;
            switch (remainder2) {
                case 1:
                    System.out.print("One" + " ");
                    break;
                case 2:
                    System.out.print("Two" + " ");
                    break;

                case 3:
                    System.out.print("Three" + " ");
                    break;
                case 4:
                    System.out.print("Four" + " ");
                    break;
                case 5:
                    System.out.print("Five" + " ");
                    break;
                case 6:
                    System.out.print("Six" + " ");
                    break;
                case 7:
                    System.out.print("Seven" + " ");
                    break;
                case 8:
                    System.out.print("Eight" + " ");
                    break;
                case 9:
                    System.out.print("Nine" + " ");
                    break;
                default:
                    System.out.print("Zero" + " ");
                    break;
            }

            reverse = reverse / 10;
        }

        scan.close();
    }
}
