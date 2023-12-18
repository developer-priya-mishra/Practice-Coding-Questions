import java.util.Scanner;

class BinarySearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[] = { 4, 20, 1, 78, 56, 35, 44, 25 };

        System.out.print("Enter the number to search : ");
        int num = scan.nextInt();

        int low = 0;
        int high = arr.length - 1;
        boolean isFound = false;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (num == arr[mid]) {
                isFound = true;
                break;
            } else if (num > arr[mid]) {
                low = mid + 1;
            } else if (num < arr[mid]) {
                high = mid - 1;
            }
        }

        if (isFound) {
            System.out.print(num + " is found");
        } else {
            System.out.print(num + " is not found");
        }
        scan.close();
    }
}
