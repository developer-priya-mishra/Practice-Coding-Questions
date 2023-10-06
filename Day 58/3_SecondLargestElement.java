import java.util.Scanner;

class SecondLargestElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int arr[] = { 1, 2, 1, 3, 3, 4, 1, 7, 7, 15, 20, 25, 100 };
        int size = arr.length;

        int largestElement = 0;
        int secondLargestElement = 0;
        if (arr[0] > arr[1]) {
            largestElement = arr[0];
        } else {
            secondLargestElement = arr[1];
        }

        for (int i = 2; i < size; i++) {
            if (arr[i] > largestElement) {
                secondLargestElement = largestElement;
                largestElement = arr[i];
            }
        }

        System.out.print("Second largest element is : " + secondLargestElement);
        scan.close();
    }
}
