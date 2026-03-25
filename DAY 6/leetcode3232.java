class leetcode3232 {
    public boolean canAliceWin(int[] nums) {
        int o=0,t=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<10){
                o+=nums[i];
            }
            else{
                t+=nums[i];
            }
        }
        if(t==o){
            return false;
        }
        else{
            return true;
        }
    }

    public static void main(String[] args) {
        leetcode3232 solution = new leetcode3232();
        int[] nums = {1, 2, 3, 4, 10, 11, 12}; // Example input
        boolean result = solution.canAliceWin(nums);
        System.out.println("Can Alice win? " + result);
    }
}
