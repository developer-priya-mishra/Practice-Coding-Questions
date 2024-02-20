class MaximumCharacterInString {
    public static void main(String[] args) {
        String name = "This is a Tiggggger";
        int arr[] = new int[127];
        for (int i = 0; i < name.length(); i++) {
            arr[name.charAt(i)] = arr[name.charAt(i)] + 1;
        }

        int max = -1;
        int character = 0;
        for (int i = 0; i < name.length(); i++) {
            if (arr[name.charAt(i)] > max) {
                max = arr[name.charAt(i)];
                character = name.charAt(i);
            }
        }

        System.out.println("Maximum nuber of character in string is " + character);

    }
}