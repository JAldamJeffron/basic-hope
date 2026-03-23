class solution33 {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int left=0,right=n-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[left]<=nums[mid])
            {
                if(nums[left]<=target && nums[mid]>target)
                {
                    right=mid-1;
                }
                else
                {
                    left=mid+1;
                }
            }
            else
            {
                if(nums[mid]<target && nums[right]>=target)
                {
                    left=mid+1;
                }
                else
                {
                    right=mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        solution33 sol = new solution33();
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(sol.search(nums, target));
    }
}