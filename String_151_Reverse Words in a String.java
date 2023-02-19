class Solution {
    public String reverseWords(String s) {
               StringBuilder sb = removeSpace(s);
        // 2.反转整个字符串
        reverse(sb, 0, sb.length() - 1);
        // 3.反转各个单词
        reverseWord(sb);
        return sb.toString();
    }
    private StringBuilder removeSpace(String s) {
        // System.out.println("ReverseWords.removeSpace() called with: s = [" + s + "]");
        int start = 0;
        int end = s.length() - 1;
        while (s.charAt(start) == ' ') start++;
        while (s.charAt(end) == ' ') end--;
        StringBuilder sb = new StringBuilder();
        while (start <= end) {
            char c = s.charAt(start);
            if (c != ' ' || sb.charAt(sb.length() - 1) != ' ') {
                sb.append(c);
            }
            start++;
        }
        // System.out.println("ReverseWords.removeSpace returned: sb = [" + sb + "]");
        return sb;
    }

    private void reverse(StringBuilder s, int l,int r){
        while(l<r){char temp = s.charAt(l);
            s.setCharAt(l, s.charAt(r));
            s.setCharAt(r, temp);
            l++;
            r--;
        }
    }
        private void reverseWord(StringBuilder sb) {
        int start = 0;
        int end = 1;
        int n = sb.length();
        while (start < n) {
            while (end < n && sb.charAt(end) != ' ') {
                end++;
            }
            reverse(sb, start, end - 1);
            start = end + 1;
            end = start + 1;
        }
        
    }
}
