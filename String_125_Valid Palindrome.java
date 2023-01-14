class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            char left = s.charAt(start);
            char right = s.charAt(end);
            boolean leftFlag = check(left);
            boolean rightFlag = check(right);
            if (leftFlag && rightFlag) {
                if (left != right) return false;
                start++;
                end--;
            } else {
                if (!leftFlag) start++;
                if (!rightFlag) end--;
            }
        }
        return true;
    }

    public boolean check(char ch) {
        if ((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) return true;
        return false;

    }
}

//if not use check flag:
//convert string to string only contains lower character and number
for(int i=0i<s.length();i++){
            if((s[i]>='a'&&s[i]<='z')||(s[i]>='0'&&s[i]<='9')){
                str+=s[i];
            }else if(s[i]>='A'&&s[i]<='Z'){
                str+=(char)s[i]+32;
            }
