class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length==1){return nums[0];}
        int mid=nums.length/2;
        HashMap<Integer,Integer> times=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            Integer nowNum;
            if(times.containsKey(num)){
                nowNum=times.get(num);
                nowNum++;
            }
            else{
                nowNum=1;
            }
            if(nowNum>mid){
                return num;
            }
            times.put(num,nowNum);
        }
        return 0;
    }
}
