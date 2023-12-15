class MergeSortedArrayRemoveDuplicate {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 4, 6, 10, 12 };
        int arr2[] = { 1, 4, 10, 12, 24, 28 };

        int size = arr1.length + arr2.length;
        int arr[] = new int[size];

        for (int i = 0; i < arr1.length; i++) {
            arr[i] = arr1[i];
        }

        int index = 0;
        for (int i = arr2.length; i < arr.length; i++) {
            arr[i] = arr2[index];
            index++;
        }

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = arr[size - 1];
                    size--;
                    j--;
                }
            }
        }

        System.out.print("New array is : ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}