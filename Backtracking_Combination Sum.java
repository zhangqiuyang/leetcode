class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res= new ArrayList<>();
        Arrays.sort(candidates);
        backtracking(res,new ArrayList<>(),candidates,target,0,0);
        return res;
    }
    public void backtracking(List<List<Integer>> res,List<Integer> path,int[] candidates,int target,int sum,int idx){
        if(sum==target){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i=idx;i<candidates.length;i++){
            if(sum+candidates[i]>target) break;
            path.add(candidates[i]);
            backtracking(res,path,candidates,target,sum+candidates[i],i);
            path.remove(path.size()-1);
        }
    }
}
