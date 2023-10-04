import java.util.Scanner;

class LinearSearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int maxSize = 10;
        int arr[] = new int[maxSize];

        System.out.print("Enter the size : ");
        int size = scan.nextInt();

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

        boolean isContain = false;
        for (int i = 0; i < size; i++) {
            if (arr[i] == num) {
                isContain = true;
                break;
            }
        }

        if (isContain) {
            System.out.println("Item is present");
        } else {
            System.out.println("Item is not present");
        }
        scan.close();
    }
}