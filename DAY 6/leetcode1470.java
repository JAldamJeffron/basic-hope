class leetcode1470 {
    public int[] shuffle(int[] nums, int n) {
        int len=nums.length;
        int arr[]=new int[len];
        int i=0,j=n,k=0;
        while(j!=len){
            arr[k]=nums[i];
            arr[++k]=nums[j];
            i++;
            j++;
            k++;
        }
        return arr;
    }

    public static void main(String[] args) {
        leetcode1470 solution = new leetcode1470();
        int[] nums = {2, 5, 1, 3, 4, 7}; // Example: nums = [2,5,1,3,4,7], n = 3
        int n = 3;
        int[] result = solution.shuffle(nums, n);
        System.out.println("Original: " + java.util.Arrays.toString(nums));
        System.out.println("Shuffled: " + java.util.Arrays.toString(result));
    }
}

