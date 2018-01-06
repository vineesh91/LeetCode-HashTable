import java.util.Hashtable;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        Hashtable<Integer, Integer> htable = new Hashtable<>();
        for (int i = 0; i < nums.length; i++) {
            if (htable.containsKey(nums[i])) {
                htable.put(nums[i], htable.get(nums[i]) + 1);
            } else {
                htable.put(nums[i],1);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (htable.get(nums[i]) == 1)
                return nums[i];
        }
        return 0;
    }
}
