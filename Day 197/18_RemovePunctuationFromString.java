class RemovePunctuationFromString {
    public static void main(String[] args) {
        String str = "Wow! That is great news.";
        str = str.replace('!', '?');
        System.out.println(str);
    }
}
