class SlidingWindow {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 7, 1, 5, 9, 10 };
        int i = 0;
        int j = 0;
        int k = 3;
        int sum = 0;
        int maxSum = 0;

        while (j < arr.length) {
            sum = sum + arr[j];
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                if (maxSum < sum) {
                    maxSum = sum;
                }
                sum = sum - arr[i];
                i++;
                j++;
            }
        }
        System.out.print("Max of sub array is " + maxSum);
    }

}