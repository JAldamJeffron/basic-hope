class solution53 {
    public int maxSubArray(int[] nums) {
        int curr=0;
        int max=nums[0];
        for (int i:nums)
        {
            curr+=i;
            if(curr>max)
            {
                max=curr;
            }
            if(curr<0)
            {
                curr=0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        solution53 sol = new solution53();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(sol.maxSubArray(nums));
    }
}