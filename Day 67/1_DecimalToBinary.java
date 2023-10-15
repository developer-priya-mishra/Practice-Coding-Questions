import java.util.Scanner;

class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the decimal number : ");
        int num = scan.nextInt();

        int arr[] = new int[100];
        int index = 0;

        while (num != 0) {
            int remainder = num % 2;
            arr[index] = remainder;
            num = num / 2;
            index += 1;
        }

        int binaryNumber = 0;
        for (int i = index - 1; i >= 0; i--) {
            binaryNumber = binaryNumber * 10 + arr[i];
        }
        System.out.print("Binary number is " + binaryNumber);

        scan.close();
    }
}

class DecimalToBinary2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the decimal number : ");
        int decimalNumber = scan.nextInt();

        StringBuilder binaryNumber = new StringBuilder();

        while (decimalNumber != 0) {
            int remainder = decimalNumber % 2;
            binaryNumber.insert(0, remainder);
            decimalNumber = decimalNumber / 2;
        }

        System.out.print("Binary number is " + binaryNumber);

        scan.close();
    }
}