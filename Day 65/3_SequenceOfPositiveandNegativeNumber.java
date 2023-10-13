class SequenceOfPositiveandNegativeNumber {
    public static void main(String[] args) {
        int arr[] = { -1, 6, 4, -2, -8, 3, 2, -7 };
        int positiveArr[] = new int[arr.length];
        int negativeArr[] = new int[arr.length];

        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                positiveArr[index1] = arr[i];
                index1 += 1;
            }
            if (arr[i] < 0) {
                negativeArr[index2] = arr[i];
                index2 += 1;
            }
        }

        for (int i = 0; i < index1; i++) {
            arr[i] = positiveArr[i];
            System.out.print(arr[i] + ", ");
        }

        int index = 0;
        for (int i = index1; i < arr.length; i++) {
            arr[i] = negativeArr[index];
            System.out.print(arr[i] + ", ");
            index += 1;
        }

    }
}
