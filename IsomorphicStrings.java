import java.util.ArrayList;
import java.util.Hashtable;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        ArrayList<Character> arr = new ArrayList<>();
        Hashtable<Character,Character> map = new Hashtable<>();
        for (int i = 0; i < t.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                if (map.get(s.charAt(i)) != t.charAt(i))
                    return false;
            }
            else {
                if (arr.contains(t.charAt(i)))
                    return false;
                map.put(s.charAt(i),t.charAt(i));
                arr.add(t.charAt(i));
            }
        }
        return true;
    }
}
