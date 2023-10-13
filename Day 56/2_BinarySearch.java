class BinarySearch {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
        int key = 15;
        int low = 0;
        int high = arr.length - 1;

        boolean isFound = false;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                isFound = true;
                break;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }

        if (isFound) {
            System.out.println("Data found");
        } else {
            System.out.println("Data not found");
        }

    }
}
