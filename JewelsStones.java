import java.util.Hashtable;

public class JewelsStones {
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        Hashtable<Character,Integer> ht = new Hashtable<>();
        for(int i = 0; i < J.length(); i++) {
            ht.put(J.charAt(i),0);
        }
        for(int i = 0; i < S.length(); i++) {
            if(ht.containsKey(S.charAt(i)))
                count++;
        }
        return count;
    }
}
