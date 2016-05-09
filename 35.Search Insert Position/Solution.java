public class Solution {
	public int search(int[] nums, int target, int low, int high) {
		int curr = 0;
		if (target < nums[low]) {
			return low;
		} else if (target > nums[high]) {
			return (high + 1);
		} else {
			Solution sol = new Solution();
			int mid = (high + low) / 2;
			if ((mid < high) && (mid > low)) {
				if (target > nums[mid])
					curr = sol.search(nums, target, mid, high);
				else if (target < nums[mid])
					curr = sol.search(nums, target, low, mid);
				else
					curr = mid;
			} else {
				if (target > nums[mid])
					curr = mid + 1;
				if (target < nums[mid])
					curr = mid;
			}
		}
		return curr;
	}

	public int searchInsert(int[] nums, int target) {
		if (nums == null)
			return 0;
		int len = nums.length;
		Solution sol = new Solution();
		int res = sol.search(nums, target, 0, len - 1);
		return res;
	}
}