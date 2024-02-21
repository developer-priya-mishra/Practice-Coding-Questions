class RemoveGivenCharacterFromString1 {
    public static void main(String[] args) {
        String s = "This is a tiger";
        s = s.replace(String.valueOf('i'), "");
        System.out.println(s);
    }
}

class RemoveGivenCharacterFromString2 {
    public static void main(String[] args) {
        String s = "This is a tiger";
        StringBuilder newS = new StringBuilder();
        char c = 'i';

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar != c) {
                newS.append(currentChar);
            }
        }
        System.out.println(newS);
    }
}
