class Solution {
    public int missingNumber(int[] nums) {
        if (nums.length <= 0) return 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == i) continue;
            int next = nums[i];
            while (next < nums.length && next != nums[next]) {
                int temp = nums[next];
                nums[next] = next;
                next = temp;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) return i;
        }
        return nums.length;
    }
}
