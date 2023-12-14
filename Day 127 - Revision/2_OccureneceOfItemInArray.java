class OccureneceOfItemInArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 1, 5, 6, 7, 8 };

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            boolean isVistited = false;
            for (int j = 0; j < arr.length; j++) {

                if (arr[i] == arr[j] && j < i) {
                    isVistited = true;
                    break;
                }
                if (arr[i] == arr[j] && j >= i) {
                    count += 1;
                }
            }

            if (!isVistited) {
                System.out.println("Occurence of " + arr[i] + " is " + count);
            }
        }
    }
}
