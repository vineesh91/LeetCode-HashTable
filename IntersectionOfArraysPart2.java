import java.util.ArrayList;
import java.util.Hashtable;

public class IntersectionOfArraysPart2 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Hashtable<Integer,Integer> ht = new Hashtable<>();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            if (ht.containsKey(nums1[i]))
                ht.put(nums1[i], ht.get(nums1[i])+1);
            else
                ht.put(nums1[i],1);
        }
        for ( int i = 0; i < nums2.length; i++) {
            if (ht.containsKey(nums2[i])) {
                int occ = ht.get(nums2[i]);
                if (occ > 0) {
                    arr.add(nums2[i]);
                }
                ht.put(nums2[i],occ-1);
            }
        }
        int[] ret = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            ret[i] = arr.get(i);
        }
        return ret;
    }
}
