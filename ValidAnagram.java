import java.util.Hashtable;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        Hashtable<Character,Integer> ht = new Hashtable<>();
        for (int i = 0; i < s.length(); i++) {
            if (ht.containsKey(s.charAt(i)))
                ht.put(s.charAt(i),ht.get(s.charAt(i))+1);
            else
                ht.put(s.charAt(i),1);
        }
        for (int j = 0; j < t.length(); j++) {
            if (!ht.containsKey(t.charAt(j)))
                return false;
            else if (ht.get(t.charAt(j)) == 0)
                return false;
            else
                ht.put(t.charAt(j),ht.get(t.charAt(j)) - 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (ht.get(s.charAt(i)) > 0 ) {
                return false;
            }
        }
        return true;
    }
}
