import java.util.Scanner;

class DeleteSpecificElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int arr[] = { 1, 2, 1, 3, 3, 4, 1, 7, 7, 15 };
        int size = arr.length;

        System.out.print("Enter the element : ");
        int num = scan.nextInt();

        for (int i = 0; i < size; i++) {
            if (arr[i] == num) {
                arr[i] = arr[size - 1];
                arr[size - 1] = 0;
                size--;
                i--;
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + ", ");
        }

        scan.close();
    }
}
