class LargestElementInArray {
    public static void main(String[] args) {
        int arr[] = { 88, 1, 2, 2, 1, 5, 6, 7, 8 };

        int largestNumber = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (largestNumber <= arr[i]) {
                largestNumber = arr[i];
            }
        }

        System.out.print("Largest Number in an array is " + largestNumber);
    }
}
