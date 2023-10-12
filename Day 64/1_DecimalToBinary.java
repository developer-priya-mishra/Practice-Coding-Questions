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

        System.out.print("Binary number is ");
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }

        scan.close();
    }
}