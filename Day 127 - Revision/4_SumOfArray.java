class SumOfArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, -4, 6, -8, -7, -25, 35, 14, 56, 7, 4, 8 };

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of Array is " + sum);
    }
}
