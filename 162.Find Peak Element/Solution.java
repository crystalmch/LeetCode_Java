public class Solution {
    public int findPeakElement(int[] nums) {
        int len = nums.length;
        if(len > 1){
            if(nums[0]>nums[1]) return 0;
            if(nums[len-1]>nums[len-2]) return len-1;
            for(int i = 1;i< len - 1;i++){
                if((nums[i]>nums[i-1])&&(nums[i]>nums[i+1])){
                    return i;
                }
            }
        }
        return 0;
    }
}