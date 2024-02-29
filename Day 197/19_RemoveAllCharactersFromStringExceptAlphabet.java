class RemoveAllCharactersFromStringExceptAlphabet {
    public static void main(String[] args) {
        String str = "Ram is a boy and he is 12 years old. Wow! he won a prize today";
        char ch[] = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i]);
        }
    }
}
