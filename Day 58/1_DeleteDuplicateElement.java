class DeleteDuplicateElement {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 3, 3, 4, 1, 7, 7, 8, 8, 9, 9, 10, 10, 15 };
        int size = arr.length;

        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = arr[size - 1];
                    arr[size - 1] = 0;
                    size--;
                    j--;
                }
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}