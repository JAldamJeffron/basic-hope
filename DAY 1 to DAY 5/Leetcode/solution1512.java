class solution1512 {
    public int numIdenticalPairs(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j] && i<j){
                    c++;
                }
            }
        }
    return c;
    }

    public static void main(String[] args) {
        solution1512 sol = new solution1512();
        int[] nums = {1,1,1,1};
        System.out.println(sol.numIdenticalPairs(nums));
    }
}