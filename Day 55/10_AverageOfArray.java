import java.util.Scanner;

class AverageOfArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int maxSize = 10;
        int arr[] = new int[maxSize];

        System.out.print("Enter the size : ");
        int size = scan.nextInt();

        System.out.print("Enter the elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.print("Array are : ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + ", ");
        }

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        int averageOfNumber = sum / size;
        System.out.print("\nAverage of array is : " + averageOfNumber);

        scan.close();

    }
}
