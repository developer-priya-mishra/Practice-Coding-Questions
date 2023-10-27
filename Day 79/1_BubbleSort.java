class BubbleSort {
    public static void main(String[] args) {
        int arr[] = { 5, 14, 2, 1, 6, 8, 4 };

        // Outer loop for pass
        loop1: for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = false;
            // Inner loop for comparison
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (flag == false) {
                break loop1;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}
