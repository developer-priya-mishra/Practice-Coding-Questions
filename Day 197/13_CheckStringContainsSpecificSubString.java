class CheckStringContainsSpecificString {
    public static void main(String[] args) {
        String str1 = "Priya";
        String str2 = "riy";
        if (str1.substring(1, 3).equals(str2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
