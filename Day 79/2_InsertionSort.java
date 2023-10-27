class InsertionSort {
    public static void main(String[] args) {
        int arr[] = { 5, 14, 2, 1, 6, 8, 4 };

        // Outr loop for Unsortd array
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];

            // Inner loop for sorted array
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }

    }
}
