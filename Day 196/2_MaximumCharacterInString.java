import java.util.HashMap;
import java.util.Map;

class MaximumCharacterInString {
    public static void main(String[] args) {
        String s = "This is tigggggger";
        s = s.replaceAll("\\s", "");

        HashMap<Character, Integer> hm = new HashMap<>();

        char[] c = s.toCharArray();
        for (char ch : c) {
            if (hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch) + 1);
            } else {
                hm.put(ch, 1);
            }
        }

        int max = 1;
        char character = ' ';

        for (Map.Entry<Character, Integer> me : hm.entrySet()) {
            if (me.getValue() > max) {
                max = me.getValue();
                character = me.getKey();
            }

        }
        System.out.println("Maximum occurring character: " + character);
        System.out.println("Frequency: " + max);
    }
}
