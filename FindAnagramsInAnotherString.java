import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class FindAnagramsInAnotherString {
    public List<Integer> findAnagrams(String s, String p) {
        Hashtable<Character,Integer> ht = new Hashtable<>();
        Hashtable<Character, Integer> htDup;
        List<Character> neg = new ArrayList<>();
        List<Integer> ret = new ArrayList<>();
        for ( int i = 0; i < p.length(); i++) {
            if(ht.containsKey(p.charAt(i))) {
                ht.put(p.charAt(i), ht.get(p.charAt(i)) + 1);
            }
            else {
                ht.put(p.charAt(i),1);
            }
        }
        htDup = new Hashtable<>(ht);
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            //ht = new Hashtable<>(htDup);

            if (ht.containsKey(s.charAt(i)) && ht.get(s.charAt(i)) > 0) {
                ht.put(s.charAt(i), ht.get(s.charAt(i)) - 1);
            }
            else {

                if (ht.containsKey(s.charAt(i))) {
                    ht.put(s.charAt(i), ht.get(s.charAt(i)) - 1);
                    if (ht.get(s.charAt(i)) < 0) {
                        neg.add(s.charAt(i));
                    }
                    ht.put(s.charAt(start), ht.get(s.charAt(start)) + 1);
                    if (neg.contains(Character.valueOf(s.charAt(start))) && (ht.get(s.charAt(start)) >= 0)) {
                        neg.remove(Character.valueOf(s.charAt(start)));
                    }
                    start++;
                }
                else {
                    start = i+1;
                    ht = new Hashtable<>(htDup);
                }
            }
            if (((i-start) == (p.length()-1))) {
                if (neg.isEmpty())
                    ret.add(start);
                ht.put(s.charAt(start), ht.get(s.charAt(start)) + 1);
                if (neg.contains(Character.valueOf(s.charAt(start))) && (ht.get(s.charAt(start)) >= 0)) {
                    neg.remove(Character.valueOf(s.charAt(start)));
                }
                start++;
            }
        }
        return ret;
    }
}
