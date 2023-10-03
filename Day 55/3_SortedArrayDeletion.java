import java.util.Scanner;

class SortedArrayDeletion {
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
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + ", ");
            }

            System.out.print("\nEnter the position : ");
            int position = scan.nextInt();

            if (position < size + 1) {
                for (int i = position - 1; i <= size - 1; i++) {
                    arr[i] = arr[i + 1];
                }
                size--;
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + ", ");
                }
            } else {
                System.out.println("Invalid position");
            }

        }
        scan.close();

    }
}
