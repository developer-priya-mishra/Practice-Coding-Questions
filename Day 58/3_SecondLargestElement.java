import java.util.Scanner;

class SecondLargestElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int arr[] = { 100, 25, 200, 105, 75, 92, 118, 225, 1500 };
        int size = arr.length;

        int isLargestElement = arr[0];
        int largestElementIndex = 0;
        for (int i = 0; i < size; i++) {
            if (isLargestElement < arr[i]) {
                isLargestElement = arr[i];
                largestElementIndex = i;
            }
        }

        arr[largestElementIndex] = 0;
        int isSecondLargestElement = arr[0];
        for (int i = 0; i < size; i++) {
            if (isSecondLargestElement < arr[i]) {
                isSecondLargestElement = arr[i];
            }
        }

        System.out.print("Second largest element is : " + isSecondLargestElement);
        scan.close();
    }
}
