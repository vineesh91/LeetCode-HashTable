import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class TopKFrequentSums {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> ret = new ArrayList<>();
        Hashtable<Integer,Integer> ht = new Hashtable<>();
        for(int i = 0; i < nums.length; i++) {
            if(ht.containsKey(nums[i])) {
                ht.put(nums[i],ht.get(nums[i])+1);
            }
            else {
                ht.put(nums[i], 1);
            }
        }
        int t = 0;
        int freq = 0;
        int elem = 0;
        int max = nums.length;
        while(t !=k ) {
            for(Integer i : ht.keySet()) {
                if(ht.get(i) > freq && ht.get(i) <= max) {
                    if(!ret.contains(i)) {
                        freq = ht.get(i);
                        elem = i;
                    }
                }
            }
            freq = 0;
            ret.add(elem);
            max = ht.get(elem);
            t++;
        }
        return ret;
    }
}
