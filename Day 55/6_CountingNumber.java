import java.util.Scanner;

class CountingNumber {
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

            System.out.print("\nEnter the number : ");
            int num = scan.nextInt();
            int numberOfCount = 0;
            for (int i = 0; i < size; i++) {
                if (arr[i] == num) {
                    numberOfCount += 1;
                }
            }
            System.out.print("Number of " + num + " comes in array is : " + numberOfCount);
        }
        scan.close();

    }
}
