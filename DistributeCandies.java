import java.util.HashMap;

public class DistributeCandies {
    public int distributeCandies(int[] candies) {
        int total = candies.length;
        int dup = 0;
        HashMap<Integer,Integer> hs = new HashMap<Integer,Integer>();
        for(int i = 0; i < total; i++) {
            if(hs.containsKey(candies[i])) {
                hs.put(candies[i],hs.get(candies[i])+1);
                dup++;
            }
            else {
                hs.put(candies[i],1);
            }
        }
        int diffKind = hs.keySet().size();
        if(dup < total/2) {
            return (diffKind-(total/2-dup));
        }
        else {
            return diffKind;
        }
    }
}
