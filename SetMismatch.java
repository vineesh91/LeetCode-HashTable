import java.util.Hashtable;

public class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        Hashtable<Integer, Integer> ht = new Hashtable<>();
        int[] ret = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (ht.containsKey(nums[i]))
                ret[0] = nums[i];
            else
                ht.put(nums[i],1);
        }
        for (int i = 1; i <= nums.length; i++ ) {
            if (!ht.containsKey(i)) {
                ret[1] = i;
                break;
            }
        }
        return ret;
    }
}
