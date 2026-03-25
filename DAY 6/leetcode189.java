class leetcode189 {
    void reverse(int i,int j,int arr[]){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k%=n;
        reverse(0,n-1,nums);
        reverse(0,k-1,nums);
        reverse(k,n-1,nums);
    }

    public static void main(String[] args) {
        leetcode189 solution = new leetcode189();
        int[] nums = {1, 2, 3, 4, 5, 6, 7}; // Example array
        int k = 3; // Rotate by 3
        System.out.println("Original: " + java.util.Arrays.toString(nums));
        solution.rotate(nums, k);
        System.out.println("Rotated by " + k + ": " + java.util.Arrays.toString(nums));
    }
}

