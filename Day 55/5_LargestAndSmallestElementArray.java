import java.util.Scanner;

class LargestElementInArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int maxSize = 10;
        int arr[] = new int[maxSize];

        System.out.print("Enter the size : ");
        int size = scan.nextInt();

        if (size <= 0) {
            System.out.println("Array is out of lower bound i.e, underflow");
        } else if (size > maxSize) {
            System.out.println("Array is out of upper bound i.e, overflow");
        } else {
            System.out.print("Enter the elements : ");
            for (int i = 0; i < size; i++) {
                arr[i] = scan.nextInt();
            }

            System.out.print("Array are : ");
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + ", ");
            }

            int largestElement = arr[0];
            for (int i = 1; i <= size - 1; i++) {
                if (largestElement <= arr[i]) {
                    largestElement = arr[i];
                }
            }
            System.out.print("\nLargest element is : " + largestElement);
        }
        scan.close();

    }
}

class SmallestElementInArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int maxSize = 10;
        int arr[] = new int[maxSize];

        System.out.print("Enter the size : ");
        int size = scan.nextInt();

        if (size <= 0) {
            System.out.println("Array is out of lower bound i.e, underflow");
        } else if (size > maxSize) {
            System.out.println("Array is out of upper bound i.e, overflow");
        } else {
            System.out.print("Enter the elements : ");
            for (int i = 0; i < size; i++) {
                arr[i] = scan.nextInt();
            }

            System.out.print("Array are : ");
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + ", ");
            }

            int smallestElement = arr[0];
            for (int i = 1; i <= size - 1; i++) {
                if (smallestElement >= arr[i]) {
                    smallestElement = arr[i];
                }
            }
            System.out.print("\nLargest element is : " + smallestElement);
        }
        scan.close();

    }
}