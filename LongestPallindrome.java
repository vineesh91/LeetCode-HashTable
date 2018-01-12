import java.util.Hashtable;

public class LongestPallindrome {
    public int longestPalindrome(String s) {
        int max = 0;
        int odd = 0;
        Hashtable<Character, Integer> ht = new Hashtable<>();
        for (int i = 0; i < s.length(); i++) {
            if (ht.containsKey(s.charAt(i))) {
                int occ = ht.get(s.charAt(i));
                if (occ == 1) {
                    max += 2;
                    odd--;
                }
                else if (occ%2 != 0) {
                    max += 2;
                    odd--;
                }
                else {
                    odd++;
                }
                ht.put(s.charAt(i), occ + 1);
            } else {
                ht.put(s.charAt(i), 1);
                odd++;
            }
        }

        if (odd > 0)
            max += 1;
        return max;
    }
}
