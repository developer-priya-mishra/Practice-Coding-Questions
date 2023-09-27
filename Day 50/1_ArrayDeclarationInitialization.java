import java.util.Scanner;

class ArrayDeclarationInitialization {
    public static void main(String[] args) {
        // ************** Compile Time Initialization **************
        int arr1[]; // declaration
        arr1 = new int[5]; // allocating size to array

        // Element by element Initialization
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        // arr1[3] = 4;
        // arr1[4] = 5;
        System.out.println(arr1[4]);

        int arr2[] = new int[5]; // declaration and allcating size to array

        // Element by element Initialization
        arr2[0] = 1;
        arr2[1] = 2;
        arr2[2] = 3;
        arr2[3] = 4;
        arr2[4] = 5;

        // Block Initialization
        int arr3[] = { 1, 2, 3, 4, 5 };
        System.out.println(arr3[0]); // Printing value of 0th index

        int arr4[] = new int[] { 1, 2, 3, 4, 5 };
        System.out.println(arr4); // Printing address of 0th index

        // ************** Run Time Initialization **************
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = scan.nextInt();

        // Declaring and allocating size of array
        int arr5[] = new int[size];

        // Initializing array by user input
        System.out.print("Enter the element : ");
        for (int i = 0; i < arr5.length; i++) {
            arr5[i] = scan.nextInt();
        }

        // Printing the array
        System.out.print("Array is ");
        for (int i = 0; i < arr5.length; i++) {
            System.out.print(arr5[i] + ", ");
        }

        scan.close();

    }
}
