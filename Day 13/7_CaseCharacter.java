class CaseCharacter {
    public static void main(String[] args) {

        char ch1 = 'p';
        char ch2 = 'P';

        if (ch1 >= 'a' && ch1 <= 'z') {
            char char3 = (char) (ch1 - 'a' + 'A');
            System.out.println("Character " + ch1 + " changes to " + char3);
        }
        if (ch2 >= 'A' && ch2 <= 'Z') {
            char char4 = (char) (ch2 - 'A' + 'a');
            System.out.println("Character " + ch2 + " changes to " + char4);
        }
    }
}