class MergeTwoArrayRemoveDuplicateElement {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5 };
        int arr2[] = { 1, 2, 3, 6, 7, 8, 9, 10 };

        int size1 = arr1.length;
        int size2 = arr2.length;
        int arr3[] = new int[size1 + size2];
        int size3 = arr3.length;
        int index = 0;

        for (int i = 0; i < size1; i++) {
            arr3[i] = arr1[i];
        }

        for (int i = size1; i < size3; i++) {
            arr3[i] = arr2[index];
            index += 1;
        }

        System.out.println("Merged Array : ");
        for (int i = 0; i < size3; i++) {
            System.out.print(arr3[i] + ", ");
        }

        for (int i = 0; i < size3 - 1; i++) {
            for (int j = i + 1; j < size3; j++) {
                if (arr3[i] == arr3[j]) {
                    arr3[j] = arr3[size3 - 1];
                    arr3[size3 - 1] = 0;
                    size3--;
                    j--;
                }
            }
        }

        System.out.println("\nArray after removing duplicate array : ");
        for (int i = 0; i < size3; i++) {
            System.out.print(arr3[i] + ", ");
        }
    }
}
