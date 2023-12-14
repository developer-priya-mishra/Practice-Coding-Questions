class ConcatenateTwoList {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 8, 9 };
        int arr2[] = { 4, 5, 6, 10 };

        int arr3[] = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }

        int index = 0;
        for (int i = arr1.length; i < arr3.length; i++) {
            arr3[i] = arr2[index];
            index++;
        }

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + ", ");
        }

    }
}
