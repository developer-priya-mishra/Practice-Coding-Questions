import java.util.Scanner;

class LinearSearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[] = { 4, 20, 1, 78, 56, 35, 44, 25 };

        System.out.print("Enter the number to search : ");
        int num = scan.nextInt();

        boolean isFound = false;
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                isFound = true;
                break;
            }
        }

        if (isFound) {
            System.out.print(num + " is found");
        } else {
            System.out.print(num + " is not found");
        }

        scan.close();
    }
}
