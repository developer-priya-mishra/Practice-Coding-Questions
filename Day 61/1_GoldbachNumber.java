import java.util.Scanner;

class GoldbachNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        int arr[] = new int[num];
        int index = 0;

        for (int i = 3; i <= num; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                arr[index] = i;
                index = index + 1;
            }
        }

        int size = index;
        for (int j = 0; j < size; j++) {
            System.out.print(arr[j] + ", ");
        }

        loop: for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] + arr[j] == num) {
                    System.out.print("\n" + num + " is a GoldbachNumber");
                    break loop;
                }
            }
        }

        scan.close();
    }
}