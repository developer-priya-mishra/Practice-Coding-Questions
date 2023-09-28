import java.util.Scanner;

class ArrayOutOfBoundCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.print("Enter the size of array : ");
        int size = scan.nextInt();

        if (size <= 0) {
            System.out.println("Array is out of lower bound (Underflow)");
        } else if (size > 5) {
            System.out.println("Array is out of upper bound (Overflow)");
        } else {
            System.out.print("Enter the elements : ");
            for (int i = 0; i < size; i++) {
                arr[i] = scan.nextInt();
            }

            System.out.println("Array are : ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + ", ");
            }
        }

        scan.close();
    }
}