import java.util.HashMap;
import java.util.Map;

class DuplicateCharacterInString {
    public static void main(String[] args) {
        String name = "This is tiger";
        name = name.replaceAll("\\s", "");

        char c[] = name.toCharArray();

        HashMap<Character, Integer> hm = new HashMap<>();

        for (char ch : c) {
            if (hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch) + 1);
            } else {
                hm.put(ch, 1);
            }
        }

        boolean foundDuplicate = false;
        System.out.print("Duplicate Character in string : ");
        for (Map.Entry<Character, Integer> me : hm.entrySet()) {
            if (me.getValue() > 1) {
                System.out.println(me.getKey() + ",");
                foundDuplicate = true;
            }
        }
        if (!foundDuplicate) {
            System.out.println("No duplicate characters found.");
        }
    }
}
