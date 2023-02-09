class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n == 1) {
            return true;
        }
        if (n == 0 || n % 2 != 0) {
            return false;
        }
        return isPowerOfTwo(n / 2);
    }
}
/*Explanation:
The base case of the recursion is when the number is equal to 1. In this case, we return true because 1 is a power of 2.
In each step of the recursion, we check if the number is divisible by 2. If the number is not divisible by 2 or equal to 0, we return false.
If the number is divisible by 2, we divide it by 2 and call the isPowerOfTwo method recursively. This process continues until we reach the base case.
If all the recursive calls return true, then the given number is a power of two and the final result will be true. If any of the recursive calls returns false, then the given number is not a power of two and the final result will be false.*/
