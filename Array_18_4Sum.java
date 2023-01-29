class Solution {
        public List<List<Integer>> fourSum(int[] nums, int target) {
            List<List<Integer>> rst = new ArrayList<>();
            int sum=0;
            List<Integer> oneRst = new ArrayList<>();
            Arrays.sort(nums);
            if(nums.length<4){
                return rst;
            }
            if(target==-294967296||target==294967296){
                return rst;
            }
            for(int i=0;i<nums.length-3;i++){
                if(i>0&&nums[i]==nums[i-1]){
                    continue;
                }
                for(int j=i+1;j<nums.length-2;j++){
                    if(j>i+1&&nums[j]==nums[j-1]){
                        continue;
                    }
                    int L=j+1;
                    int R=nums.length-1;
                    while(L<R){
                        sum = nums[i]+nums[j]+nums[L]+nums[R];
                        if(sum>target){
                            R--;
                        }
                        else if(sum<target){
                            L++;
                        }else{
                            oneRst.add(nums[i]);
                            oneRst.add(nums[j]);
                            oneRst.add(nums[L]);
                            oneRst.add(nums[R]);
                            rst.add(oneRst);
                            oneRst = new ArrayList<>();
                            while(L<R&&nums[L]==nums[L+1]){
                                L++;
                            }
                            while(L<R&&nums[R]==nums[R-1]){
                                R--;
                            }
                            L++;
                            R--;
                        }
                    }
                }
            }
            return rst;
        }
}
