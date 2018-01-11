import java.util.Hashtable;

public class UniqueCharacter {
    public int firstUniqChar(String s) {
        Hashtable<Character, Integer> ht = new Hashtable<>();
        Hashtable<Integer, Integer> gs = new Hashtable<>();
        for (int i = 0; i < s.length(); i++) {
            if (ht.containsKey(s.charAt(i))) {
                gs.put(ht.get(s.charAt(i)), 1);
            } else {
                gs.put(i,0);
                ht.put(s.charAt(i), i);
            }
        }
        for (int j = 0; j < s.length(); j++) {
            if (gs.containsKey(j) && gs.get(j) == 0)
                return j;
        }
        return -1;
    }
}
