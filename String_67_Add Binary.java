class Solution {
    public String addBinary(String a, String b) {
        int m=a.length();
        int n=b.length();
        int len = Math.max(m,n);
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<len;i++){
            int sum = carry;
            int num = 0;
            if(m-1-i>=0){
                num = a.charAt(m-1-i)-'0';
            }
            int num2=0;
            if(n-1-i>=0){
                num2=b.charAt(n-1-i)-'0';
            }
            sum+= num+num2;
            sb.insert(0,sum%2+"");
            carry=sum/2;
        }
        if(carry!=0){
            sb.insert(0,carry+"");
        }
        return sb.toString();
            }
}
