import java.util.*;

class lt268 {
    public int missingNumber(int[] nums) {
        HashSet set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        for (int i = 0; i < set.size(); i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return set.size();
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 4, 5 };
        lt268 s = new lt268();
        System.out.println(s.missingNumber(nums));
    }
}