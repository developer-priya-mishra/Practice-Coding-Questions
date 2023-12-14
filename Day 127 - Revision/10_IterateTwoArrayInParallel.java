class IterateTwoArrayInParallel {
    public static void main(String[] args) {
        String arr1[] = { "Frodo", "Gandaulf", "Sam", "Aragon", "Sneaggle" };
        int arr2[] = { 21, 110, 22, 86, 35 };

        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Age of " + arr1[i] + " is " + arr2[i]);
        }
    }
}
