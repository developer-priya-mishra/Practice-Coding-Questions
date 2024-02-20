class CheckStringPalindrome {
    public static void main(String[] args) {
        String name = "anana";
        String reverseName = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reverseName += name.charAt(i);
        }
        if (name.equals(reverseName)) {
            System.out.print("Given string is palindrome");
        } else {
            System.out.print("Given string is not a palindrome");
        }
    }
}