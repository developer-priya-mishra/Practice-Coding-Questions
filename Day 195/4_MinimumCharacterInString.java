class MinimumCharacterInString {
    public static void main(String[] args) {
        String s = "This is tiger";
        int arr[] = new int[127];
        char character = ' ';
        int min = 0;
        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i)] <= min) {
                min = arr[s.charAt(i)];
                character = s.charAt(i);
            }
        }
        System.out.println("Minimum nubber of character in string is " + character);
    }
}
