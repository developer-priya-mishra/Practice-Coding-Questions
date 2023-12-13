import java.util.Scanner;

class DeleteElementsInSortedArrayAtEnd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        arr[arr.length - 1] = 0;

        System.out.print("Array after deletion are : ");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }

        scan.close();
    }
}

class DeleteElementsInSortedArrayInBetween {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        System.out.print("Enter the position to be deleted : ");
        int position = scan.nextInt();

        for (int i = position - 1; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        System.out.print("Array after deletion are : ");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }

        scan.close();
    }
}

class DeleteElementsInSortedArrayAtBeginning {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        System.out.print("Enter the position to be deleted : ");
        int position = scan.nextInt();

        for (int i = position - 1; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        System.out.print("Array after deletion are : ");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }

        scan.close();
    }
}
