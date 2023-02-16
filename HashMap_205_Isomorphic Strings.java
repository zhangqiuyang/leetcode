class Solution {
    public boolean isIsomorphic(String s, String t) {
        return helper(s).equals(helper(t));
    }
    private String helper(String s){
        HashMap<Character,Integer> maps=new HashMap<>();
        StringBuilder result = new StringBuilder();
        
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!maps.containsKey(c)){
               maps.put(s.charAt(i),i); 
            }
            result.append(Integer.toString(maps.get(c)));
            result.append(" "); 

        }
        return result.toString();
    }
}
