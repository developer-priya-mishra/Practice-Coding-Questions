import java.util.Scanner;

class RemoveSpecificItem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[] = { 1, 4, 4, 1, 5, 6, 7, 105, 604, 22, 355 };
        int size = arr.length;

        System.out.print("Enter the item to be delete : ");
        int item = scan.nextInt();

        for (int i = 0; i < size; i++) {
            if (arr[i] == item) {
                arr[i] = arr[size - 1];
                size--;
                i--;
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + ",");
        }

        scan.close();
    }
}
