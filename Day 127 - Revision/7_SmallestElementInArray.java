class SmallestElementInArray {
    public static void main(String[] args) {
        int arr[] = { 8, 1, 2, 2, 1, 5, 6, 7, 0, -5 };

        int smallestElement = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (smallestElement >= arr[i]) {
                smallestElement = arr[i];
            }
        }

        System.out.print("Smallest Element in array is " + smallestElement);

    }
}
