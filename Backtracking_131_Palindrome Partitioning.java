class Solution {
    List<List<String>> lists = new ArrayList<>();
        Deque<String> deque= new LinkedList<>();
    public List<List<String>> partition(String s) {
        
        backtracking(s,0);
        return lists;
    }
    private void backtracking(String s, int startIndex){
        if(startIndex>=s.length()){
            lists.add(new ArrayList(deque));
            return;
        }
        for(int i=startIndex;i<s.length();i++){
            if(isPalindrome(s,startIndex,i)){
                String str=s.substring(startIndex,i+1);
                deque.addLast(str);
            }else{
                continue;
            }
            backtracking(s,i+1);
            deque.removeLast();
        }
    }
    private boolean isPalindrome(String s, int startIndex, int end) {
        for (int i = startIndex, j = end; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
