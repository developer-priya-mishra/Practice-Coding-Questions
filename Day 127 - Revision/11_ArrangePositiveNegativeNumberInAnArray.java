class ArrangePositiveNegativeNumberInAnArray {
    public static void main(String[] args) {
        int arr[] = { 4, 8, 3, -4, -8, -1, -3, 0, 2, 6 };

        int positiveArray[] = new int[arr.length];
        int negativeArray[] = new int[arr.length];
        int index1 = 0;
        int index2 = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                positiveArray[index1] = arr[i];
                index1++;
                count += 1;
            } else {
                negativeArray[index2] = arr[i];
                index2++;
            }

        }

        for (int i = 0; i < count; i++) {
            arr[i] = positiveArray[i];
        }

        int index3 = 0;
        for (int i = count; i < arr.length; i++) {
            arr[i] = negativeArray[index3];
            index3++;
        }

        System.out.print("Array are ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }

    }
}
