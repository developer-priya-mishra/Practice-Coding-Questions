import java.util.Scanner;

class InsertElementInUnsortedArrayInBetween {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maxSize = 10;

        int[] arr = new int[maxSize];

        System.out.print("Enter the size of array : ");
        int size = scan.nextInt();

        System.out.print("Enter the elements of array : ");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        if (size >= maxSize) {
            System.out.println("Array is full");
        } else {
            System.out.print("Enter the position to insert the element : ");
            int pos = scan.nextInt();

            System.out.print("Enter the element to be inserted : ");
            int item = scan.nextInt();

            arr[size] = arr[pos - 1];
            arr[pos - 1] = item;
            size++;

            System.out.print("Array are : ");
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + ", ");
            }
        }

        scan.close();
    }
}

class InsertElementInUnsortedArrayAtBeginning {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maxSize = 10;

        int[] arr = new int[maxSize];

        System.out.print("Enter the size of array : ");
        int size = scan.nextInt();

        System.out.print("Enter the elements of array : ");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        if (size >= maxSize) {
            System.out.println("Array is full");
        } else {
            System.out.print("Enter the element to be inserted : ");
            int item = scan.nextInt();

            arr[size] = arr[0];
            arr[0] = item;
            size++;

            System.out.print("Array are : ");
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + ", ");
            }
        }

        scan.close();
    }
}

class InsertElementInUnsortedArrayAtEnd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maxSize = 10;

        int[] arr = new int[maxSize];

        System.out.print("Enter the size of array : ");
        int size = scan.nextInt();

        System.out.print("Enter the elements of array : ");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        if (size >= maxSize) {
            System.out.println("Array is full");
        } else {
            System.out.print("Enter the element to be inserted : ");
            int item = scan.nextInt();

            arr[size] = item;
            size++;

            System.out.print("Array are : ");
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + ", ");
            }
        }

        scan.close();
    }
}
