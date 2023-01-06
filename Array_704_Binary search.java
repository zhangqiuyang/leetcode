class Solution {
public int search(int[] nums, int target) {
int n = nums.length;
if (target < nums[0] || target > nums[n - 1]) {
return -1;
}
int first = 0;
int last = nums.length - 1;
while (first <= last) {
int mid = first + (last - first) / 2;
if (nums[mid] > target) {
last = mid - 1;
} else if (nums[mid] < target) {
first = mid + 1;
} else {
return mid;
}
}
return -1;
}
}
