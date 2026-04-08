import java.util.*;

class Solution {
    public int closest(int[] arr, int target) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i : arr) {
            set.add(i);
        }

        Integer f = set.lower(target);
        Integer c = set.higher(target);
        if (f == null)
            return c;
        if (c == null)
            return f;
        if (c - target < target - f)
            return c;
        else
            return f;
    }
}

public class Tree {
    public static void main(String args[]) {
        int[] arr = { 10, 20, 30, 32, 40, 50 };
        int target = 30;
        Solution s = new Solution();
        System.out.println(s.closest(arr, target));
    }
}
