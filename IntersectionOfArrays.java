import java.util.Hashtable;

public class IntersectionOfArrays {
    public int[] intersection(int[] nums1, int[] nums2) {

        int count = 0;
        Hashtable<Integer,Integer> ht = new Hashtable<>();
        for  (int i = 0; i < nums1.length; i++) {
            ht.put(nums1[i],0);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (ht.containsKey(nums2[i])) {
                if (ht.get(nums2[i]) == 0) {
                    ht.put(nums2[i],1);
                    count++;
                }
            }
        }
        int[] ret = new int[count];
        int k = 0;
        for (int j = 0; j < nums2.length; j++) {
            if (ht.containsKey(nums2[j]) && ht.get(nums2[j]) == 1) {
                ret[k] = nums2[j];
                k++;
                ht.remove(nums2[j]);
            }
        }
        return ret;
    }
}
