class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length==1) return;
        int n=nums.length-2;
        while(n>=0&&nums[n]>=nums[n+1]){
            n--;
        }
        if(n<0){
            Arrays.sort(nums);
            return;
        }
        int m=n+1;
        while(m<nums.length&&nums[m]>nums[n]){
            m++;
        }
        swap(nums,n,m-1);
        Arrays.sort(nums,n+1,nums.length);
        return;
    }
    private void swap(int[] nums,int l,int r){
        int temp= nums[l];
        nums[l]=nums[r];
        nums[r]=temp;
    }
    
}
