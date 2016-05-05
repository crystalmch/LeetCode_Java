public class Solution {
    public int findDuplicate(int[] nums) {
		int len = nums.length;
		int flag = 0;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if ((nums[j] - nums[i]) == 0) {
					flag = nums[i];
					break;
				}
			}
			if (flag != 0)
				break;
		}
		return flag;      
    }
}