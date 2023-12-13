import java.util.Scanner;

class DeleteElementsInUnsortedArrayAtEnd {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 5, 2, 7, 20, 9 };

        arr[arr.length - 1] = 0;

        System.out.print("Array after deletion are : ");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}

class DeleteElementsInUnsortedArrayAtBeginning {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 5, 2, 7, 20, 9 };

        arr[0] = arr[arr.length - 1];

        System.out.print("Array after deletion are : ");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}

class DeleteElementsInUnsortedArrayInBetween {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int arr[] = { 1, 3, 4, 5, 2, 7, 20, 9 };

        System.out.print("Enter the position to be deleted : ");
        int position = scan.nextInt();
        arr[position - 1] = arr[arr.length - 1];

        System.out.print("Array after deletion are : ");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }

        scan.close();
    }
}