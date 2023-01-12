class Solution {
    public int lengthOfLastWord(String s) {
        if(s==null||s.length()==0){
return 0;
        }
        String[] arrays=s.split(" ");
        String str = arrays[arrays.length-1];
        return str.length();
    }
}
