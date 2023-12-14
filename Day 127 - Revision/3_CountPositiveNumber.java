class CountPositiveNumber {
    public static void main(String[] args) {
        int arr[] = { 1, 2, -4, 6, -8, -7, -25, 35, 14, 56, 7, 4, 8 };

        int countPositiveNumber = 0;
        int countNegativeNumber = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] >= 0) {
                countPositiveNumber++;
            } else {
                ++countNegativeNumber;
            }
        }

        System.out.println("Positive Numbers are " + countPositiveNumber);
        System.out.println("Negative Numbers are " + countNegativeNumber);
    }
}
