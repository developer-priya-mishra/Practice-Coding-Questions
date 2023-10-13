class IntersectionOfTwoArray {
    public static void main(String[] args) {
        int arr1[] = { 44, 54, 78, 69, 70, 7, 5, 1 };
        int arr2[] = { 44, 54, 78, 69, 3, 4, 5, 6, 7, 8 };
        int intersection = 0;

        System.out.print("Intersection of two array is ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    intersection = arr1[i];
                    System.out.print(intersection + ", ");
                }
            }
        }
    }
}
