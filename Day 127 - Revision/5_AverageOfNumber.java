class AverageOfNumber {
    public static void main(String[] args) {
        int arr[] = { 1, 2, -4, 6, -8, -7, -25, 35, 14, 56, 7, 4, 8 };

        int sum = 0;
        int count = arr.length;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        int averageOfArray = sum / count;
        System.out.println("Sum of Array is " + averageOfArray);
    }
}
