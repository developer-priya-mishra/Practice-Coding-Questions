import java.util.Scanner;

class CountingFrequency {
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

            for (int i = 0; i < size; i++) {
                int count = 0;
                boolean isDuplicate = false;
                for (int j = 0; j < size; j++) {
                    if (arr[i] == arr[j]) {
                        if (j < i) {
                            isDuplicate = true;
                            break;
                        } else {
                            count = count + 1;
                        }
                    }
                }
                if (!isDuplicate)
                    System.out.print("\nFrequency of " + arr[i] + " is " + count);
            }

        }
        scan.close();

    }
}
