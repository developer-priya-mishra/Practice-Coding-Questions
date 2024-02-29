class CheckStringStartsWihOtherString {
    public static void main(String[] args) {
        String str1 = "priya";
        String str2 = "priya";

        if (str1.charAt(0) == str2.charAt(0)) {
            System.out.println("First string starts with another string");
        } else {
            System.out.println("First string do not starts with another string");
        }
    }
}
