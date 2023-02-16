class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set= new HashSet<>();
        while(!set.contains(n)){
            set.add(n);
            n=getsum(n);
        }
        return set.contains(1);
    }
    public int getsum(int n){
        int res=0;
        while(n>0){
            int temp=n%10;
            res+=temp*temp;
            n/=10;
        }
        return res;
    }
}
