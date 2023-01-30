class Solution {
    public int lengthOfLongestSubstring(String s) {
    	//建立哈希表window记录窗口中字符的数量
        HashMap<Character, Integer> window = new HashMap<>();
        //窗口的左右边界
        int left = 0;
        int right = 0;
        //记录我们的结果
        int res = 0;
        //右边界还没有到字符串s的右边界，说明res的结果还不是最终结果
        while(right < s.length()) {
        	//取出右边界的字符，将其记录在window中
            char c1 = s.charAt(right);
            window.put(c1, window.getOrDefault(c1,0) + 1);
            //记录字符的同时右边界也增加l
            right++;
            //遇到重复的字符，则开始移动左边界
            while(window.get(c1) > 1) {
                char c2 = s.charAt(left);
                int temp = window.get(c2);
                temp--;
                window.put(c2,temp);
                left++;
            }
            //取出窗口的最大值java
            res = Math.max(res, right - left);
        }
        return res;
    }
}
