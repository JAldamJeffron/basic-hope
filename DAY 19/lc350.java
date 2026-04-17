import java.util.*;

class lc350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums1) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        List<Integer> list = new ArrayList<>();
        for (int i : nums2) {
            if (map.containsKey(i) && map.get(i) > 0) {
                list.add(i);
                map.put(i, map.get(i) - 1);
            }
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        lc350 solution = new lc350();
        
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] result1 = solution.intersect(nums1, nums2);
        System.out.println("Intersection of [1, 2, 2, 1] and [2, 2]: " + Arrays.toString(result1));

        int[] nums3 = {4, 9, 5};
        int[] nums4 = {9, 4, 9, 8, 4};
        int[] result2 = solution.intersect(nums3, nums4);
        System.out.println("Intersection of [4, 9, 5] and [9, 4, 9, 8, 4]: " + Arrays.toString(result2));
    }
}