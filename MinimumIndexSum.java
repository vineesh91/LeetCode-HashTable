import java.util.ArrayList;
import java.util.Hashtable;

public class MinimumIndexSum {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Hashtable<String,Integer> ht = new Hashtable<>();
        ArrayList<String> ar = new ArrayList<>();
        int minSum = list1.length + list2.length;
        for (int i = 0; i < list1.length; i++) {
            ht.put(list1[i],i);
        }
        for (int i = 0; i < list2.length; i++) {
            if (ht.containsKey(list2[i])) {
                int sum = (ht.get(list2[i]) + i);
                if (sum < minSum) {
                    ar = new ArrayList<>();
                    ar.add(list2[i]);
                    minSum = sum;
                }
                else if (sum == minSum) {
                    ar.add(list2[i]);
                }
            }
        }
        String[] ret = new String[ar.size()];
        for (int i = 0; i < ar.size(); i++) {
            ret[i] = ar.get(i);
        }
        return ret;
    }
}
