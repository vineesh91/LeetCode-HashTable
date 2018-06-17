import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PartitionLabels {
    public List<Integer> partitionLabels(String S) {
        List<Integer> ret = new ArrayList<>();
        HashMap<Character,Integer> endIndexes = new HashMap<>();
        for(int i = 0; i < S.length(); i++) {
            endIndexes.put(S.charAt(i),i);
        }
        int start = 0;
        int end = 0;
        for(int i = 0; i < S.length(); i++) {
            if(endIndexes.get(S.charAt(i)) > end) {
                end = endIndexes.get(S.charAt(i));
            }
            if(i == end) {
                ret.add(end-start);
                start = i + 1;
                end = start;
            }
        }
        return ret;
    }
}
