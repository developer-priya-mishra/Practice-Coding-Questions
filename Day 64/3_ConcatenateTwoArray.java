class ConcatenateTwoArray {
    public static void main(String[] args) {
        int arr1[] = { 10, 12, 8, 5, 6, 20, 4 };
        int arr2[] = { 2, 5, 6, 7, 8 };

        int size1 = arr1.length;
        int size2 = arr2.length;
        int size3 = size1 + size2;
        int arr3[] = new int[size3];
        int index = 0;

        for (int i = 0; i < size1; i++) {
            arr3[i] = arr1[i];
        }

        for (int i = size1; i < size3; i++) {
            arr3[i] = arr2[index];
            index += 1;
        }

        for (int i = 0; i < size3; i++) {
            System.out.print(arr3[i] + ", ");
        }

    }
}
