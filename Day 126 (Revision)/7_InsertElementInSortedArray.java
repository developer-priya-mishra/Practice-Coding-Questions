import java.util.Scanner;

class InsertElementInSortedArrayInBetween {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maxSize = 10;
        int[] sortedArray = new int[maxSize];

        System.out.print("Enter the size of array : ");
        int size = scan.nextInt();

        System.out.print("Enter the elements of array : ");
        for (int i = 0; i < size; i++) {
            sortedArray[i] = scan.nextInt();
        }

        if (size >= maxSize) {
            System.out.println("Array is full");
        } else {
            System.out.print("Enter the position to insert the element : ");
            int pos = scan.nextInt();

            System.out.print("Enter the element to be inserted : ");
            int item = scan.nextInt();

            for (int i = size - 1; i >= pos - 1; i--) {
                sortedArray[i + 1] = sortedArray[i];
            }
            size++;
            sortedArray[pos - 1] = item;

            System.out.print("Sorted array are : ");
            for (int i = 0; i < size; i++) {
                System.out.print(sortedArray[i] + ",");
            }
        }

        scan.close();
    }
}

class InsertElementInSortedArrayAtBeginning {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maxSize = 10;
        int[] sortedArray = new int[maxSize];

        System.out.print("Enter the size of array : ");
        int size = scan.nextInt();

        System.out.print("Enter the elements of array : ");
        for (int i = 0; i < size; i++) {
            sortedArray[i] = scan.nextInt();
        }

        if (size >= maxSize) {
            System.out.println("Array is full");
        } else {
            System.out.print("Enter the element to be inserted : ");
            int item = scan.nextInt();

            for (int i = size - 1; i >= 0; i--) {
                sortedArray[i + 1] = sortedArray[i];
            }
            size++;
            sortedArray[0] = item;

            System.out.print("Sorted array are : ");
            for (int i = 0; i < size; i++) {
                System.out.print(sortedArray[i] + ",");
            }
        }

        scan.close();
    }
}

class InsertElementInSortedArrayAtTheEnd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maxSize = 10;
        int[] sortedArray = new int[maxSize];

        System.out.print("Enter the size of array : ");
        int size = scan.nextInt();

        System.out.print("Enter the elements of array : ");
        for (int i = 0; i < size; i++) {
            sortedArray[i] = scan.nextInt();
        }

        if (size >= maxSize) {
            System.out.println("Array is full");
        } else {
            System.out.print("Enter the element to be inserted : ");
            int item = scan.nextInt();

            size++;
            sortedArray[size - 1] = item;

            System.out.print("Sorted array are : ");
            for (int i = 0; i < size; i++) {
                System.out.print(sortedArray[i] + ",");
            }
        }

        scan.close();
    }
}
