class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sub=Integer.MAX_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            int left=i+1,right=nums.length-1;
            while(left<right){
                if(Math.abs((nums[left]+nums[right]+nums[i]-target))<sub){
                    sum=nums[left]+nums[right]+nums[i];
                    sub=Math.abs(sum-target);
                }
                if(nums[left]+nums[right]+nums[i]>target){
                right--;
            }else{
                left++;
            }

            }
        }
        return sum;
    }
}
