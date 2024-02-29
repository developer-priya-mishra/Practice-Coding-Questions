class CapitalizeFirstCharacterOfString {
    public static void main(String[] args) {
        String str = "priya";

        String str1 = str.substring(0, 1).toUpperCase();
        String str2 = str.substring(1);

        System.out.println(str1 + str2);
    }
}
