import java.util.*;

public class lc_56 {
    public int[][] merge(int[][] intervals) {
        Comparator<int[]> byzeroindex = new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[0], b[0]);
            }
        };
        Arrays.sort(intervals, byzeroindex);
        List<int[]> res = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            int[] curr = intervals[i];
            if (res.isEmpty() || res.get(res.size() - 1)[1] < curr[0]) {
                res.add(curr);
            } else {
                int[] merge = res.get(res.size() - 1);
                merge[1] = Math.max(merge[1], curr[1]);
            }
        }
        return res.toArray(new int[res.size()][2]);
    }
}

/*
 * public int[][] merge(int[][] intervals) {
 * //if(intervals == null || intervals.length==1) return intervals;
 * Arrays.sort(intervals,(a,b)->a[0]-b[0]);
 * List<int []> list = new ArrayList<>();
 * int c[] = intervals[0];
 * for(int i=1;i<intervals.length;i++){
 * if(intervals[i][0] <= c[1]){
 * c[1] = Math.max(c[1],intervals[i][1]);
 * }
 * else{
 * list.add(c);
 * c = intervals[i];
 * 
 * }
 * 
 * }
 * list.add(c);
 * return list.toArray(new int[list.size()][2]);
 * }
 */