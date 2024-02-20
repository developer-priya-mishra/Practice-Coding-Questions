class NumberOfWordsInString {
    public static void main(String[] args) {
        String s = "Priya ";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count++;
        }
        System.out.println("Number of words in string is : " + count);
    }
}
