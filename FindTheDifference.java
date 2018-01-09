import java.util.Hashtable;

public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        char c = t.charAt(0);
        Hashtable<Character,Integer> ht = new Hashtable<>();
        for (int i = 0; i < s.length(); i++) {
            if(!ht.containsKey(s.charAt(i)))
                ht.put(s.charAt(i),1);
            else
                ht.put(s.charAt(i),ht.get(s.charAt(i))+1);
        }
        for (int j = 0; j < t.length(); j++) {
            if (!ht.containsKey(t.charAt(j)))
                return t.charAt(j);
            else if (ht.get(t.charAt(j)) == 0)
                return t.charAt(j);
            else
                ht.put(t.charAt(j),ht.get(t.charAt(j))-1);

        }
        return c;
    }
}
