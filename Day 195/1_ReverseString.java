class ReverseString {
    public static void main(String[] args) {
        String name = "Priya";
        String reverseName = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reverseName += name.charAt(i);
        }
        System.out.println("Reverse Name is : " + reverseName);
    }
}