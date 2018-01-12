import java.util.Hashtable;

public class WordPattern {
    public boolean wordPattern(String pattern, String str) {
        Hashtable<Character,Integer> htr = new Hashtable<>();
        Hashtable<String,Integer> htStr = new Hashtable<>();
        int[] arr = new int[pattern.length()];
        for( int i = 0; i < pattern.length(); i++) {
            if (htr.containsKey(pattern.charAt(i)))
                arr[i] = htr.get(pattern.charAt(i));
            else {
                htr.put(pattern.charAt(i),i);
                arr[i] = i;
            }
        }
        String[] stArr = str.split(" ");
        int i = 0;
        for (String s : stArr) {
            if (i >= arr.length)
                return false;
            if (htStr.containsKey(s)) {
                if (htStr.get(s) != arr[i])
                    return false;
            }
            else {
                if(i != arr[i]) {
                    return false;
                }
                htStr.put(s,i);
            }
            i++;
        }
        if (i != arr.length) {
            return false;
        }
        return true;
    }
}
