class Solution {
    public String convertToTitle(int columnNumber) {
        String result ="";
        while(columnNumber!=0){
            result = (char)((columnNumber-1)%26+'A')+result;
            columnNumber=(columnNumber-1)/26;
        }
        return result;
    }
}
