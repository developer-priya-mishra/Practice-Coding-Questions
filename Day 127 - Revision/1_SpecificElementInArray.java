import java.util.Scanner;

class SpecificElementInArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int arr[] = { 11, 2, 35, 46, 25, 5, 7, 6, 3 };

        System.out.print("Enter the elements to search : ");
        int item = scan.nextInt();

        boolean isContain = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                isContain = true;
                break;
            }
        }

        if (isContain) {
            System.out.print("Array contain the element " + item);
        } else {
            System.out.print("Array do not contain the element " + item);
        }

        scan.close();
    }
}