class Solution {
    public double myPow(double x, int n) {
       if(n == 0) return 1;
        if(n == -2147483648) return 1/x*myPow(x,n+1);
        if(n < 0) return 1/myPow(x, -n);
        double y = myPow(x, n/2);
        if(n%2==0) return y*y;
        else return x*y*y;

    }
}
