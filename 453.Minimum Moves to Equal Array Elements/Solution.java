public class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int count = 0;
        for(int i = 1; i < len; i++){
            count += (nums[i] - nums[0]);
        }
        return count;
    }
}