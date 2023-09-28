import java.util.Scanner;

class ArrayIntDefaultValue {
    public static void main(String[] args) {
        // ****************** Compile Time ******************

        int arr[] = new int[10];

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        System.out.println("Compiled Time");
        System.out.print("Array element are: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }

        // ****************** RunTime ******************

        Scanner scan = new Scanner(System.in);
        int arr2[] = new int[10];

        System.out.println("\nRunTime");

        System.out.print("Enter size of array: ");
        int size = scan.nextInt();

        System.out.print("Enter array elements: ");
        for (int i = 0; i < size; i++) {
            arr2[i] = scan.nextInt();
        }

        System.out.print("Array element are: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + ", ");
        }

        scan.close();
    }
}

class ArrayCharDefaultValue {
    public static void main(String[] args) {

        // ****************** RunTime ******************

        Scanner scan = new Scanner(System.in);
        char arr2[] = new char[10];

        System.out.println("RunTime");

        System.out.print("Enter size of array: ");
        int size = scan.nextInt();

        System.out.print("Enter array elements: ");
        for (int i = 0; i < size; i++) {
            String str = scan.nextLine();
            if (str.length() > 0) {
                arr2[i] = str.charAt(0);
            } else {
                i--; // Decrement the index to re-enter the value
            }
        }

        System.out.print("Array element are: \0");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + ", ");
        }

        scan.close();
    }
}
