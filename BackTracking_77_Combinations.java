class Solution {
            List<List<Integer>> result = new ArrayList<>();
        LinkedList<Integer> path= new LinkedList<>();
    public List<List<Integer>> combine(int n, int k) {
    
        combineHelper(n, k, 1);
        return result;
    }
    private void combineHelper(int n,int k,int startIndex){
        if(path.size()==k){
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i=startIndex;i<=n;i++){
            path.add(i);
            combineHelper(n,k,i+1);
            path.removeLast();
        }
    }
}
