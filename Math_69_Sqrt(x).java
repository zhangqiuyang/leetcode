class Solution {
    public int mySqrt(int x) {
        // 方法一：一种用指数函数exp和对数函数ln代替平方根函数的方法
        if (x == 0){
            return 0;
        }
        int ans = (int)Math.exp(0.5 * Math.log(x));
        // 数字可能太大，最好使用长整型进行强制类型转换，进行log运算一般会出现小数,
        // 因为有小数，正确答案和原始的差距肯定是不超过1的,在进行比较的时候，也只需要将前面一个进行强制类型转换
        return (long)(ans + 1) * (ans + 1) <= x ? ans+1 : ans;

    }
}
