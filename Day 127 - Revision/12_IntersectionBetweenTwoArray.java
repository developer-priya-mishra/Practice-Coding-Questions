class IntersectionBetweenTwoArray {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 8, 9 };
        int arr2[] = { 4, 1, 2, 5, 6, 9 };

        System.out.print("Intersection Between two array is :");
        for (int i = 0; i < arr1.length; i++) {
            loop: for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + ", ");
                    break loop;
                }
            }
        }
    }
}
