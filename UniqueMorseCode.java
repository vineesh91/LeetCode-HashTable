import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCode {
    public int uniqueMorseRepresentations(String[] words) {
        StringBuffer trnsfrmToAdd = new StringBuffer();
        Set<String> trnsfrm = new HashSet<String>();
        String[] mrs = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",
                ".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for(String word : words) {
            trnsfrmToAdd = new StringBuffer();
            for(int i = 0; i < word.length(); i++) {
                int ascii = word.charAt(i);
                trnsfrmToAdd.append(mrs[ascii-97]);
            }
            trnsfrm.add(trnsfrmToAdd.toString());
        }
        return trnsfrm.size();
    }
}
