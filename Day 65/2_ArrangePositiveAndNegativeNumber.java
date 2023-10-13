class ArrangePositiveAndNegativeNumber {
    public static void main(String[] args) {
        int arr[] = { -1, 6, 4, -2, -8, 3, 2, -7 };
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                int index = arr[a];
                arr[a] = arr[i];
                arr[i] = index;
                a += 1;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}
