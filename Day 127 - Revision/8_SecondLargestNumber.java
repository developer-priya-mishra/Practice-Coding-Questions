class SecondLargestNumber {
    public static void main(String[] args) {
        int arr[] = { 8, 1, 2, 2, 1, 5, 6, 7, 8 };

        int largestNumber = Integer.MIN_VALUE;
        int secondLargestNumber = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largestNumber) {
                secondLargestNumber = largestNumber;
                largestNumber = arr[i];
            } else if (arr[i] > secondLargestNumber && arr[i] != largestNumber) {
                secondLargestNumber = arr[i];
            }
        }
        System.out.print("Second largest Number in an array is " + secondLargestNumber);
    }
}
