import java.util.Scanner;

class InsertUnsortedElementsInBetween {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int maxSize = 10;
        int[] arr = new int[maxSize];

        System.out.print("Enter the size of array : ");
        int size = scan.nextInt();

        if (size <= 0) {
            System.out.println("Array is out of lower bound (Underflow)");
        } else if (size > maxSize) {
            System.out.println("Array is out of upper bound (Overflow)");
        } else {
            System.out.print("Enter the elements : ");
            for (int i = 0; i < size; i++) {
                arr[i] = scan.nextInt();
            }

            System.out.print("Array are : ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + ", ");
            }

            System.out.print("\nEnter the position to insert element : ");
            int position = scan.nextInt();

            // insert if space is available in array
            if (size < maxSize) {
                System.out.print("Enter the number : ");
                int num = scan.nextInt();

                // inserting element at 0th index or in b/w array
                if (position < size + 1) {
                    for (int i = size - 1; i >= position - 1; i--) {
                        arr[i + 1] = arr[i];
                    }
                    arr[position - 1] = num;
                    size++;
                    for (int j = 0; j < arr.length; j++) {
                        System.out.print(arr[j] + ", ");
                    }
                }
                // inserting element after last element
                else if (position == size + 1) {
                    arr[position - 1] = num;
                    size++;
                    for (int j = 0; j < arr.length; j++) {
                        System.out.print(arr[j] + ", ");
                    }
                }
                // We can also not insert element if position is greater than size+1
                else {
                    System.out.println("Invalid position");
                }
            }
            // We cannot insert element if there is no space in array i.e, size = maxSize
            else {
                System.out.println("Array is full");
            }

        }

        scan.close();

    }
}
