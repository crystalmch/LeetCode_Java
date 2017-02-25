public class Solution {
    public int minMoves2(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        int count = 0;
        int flag = 0;
        for(int i = 1; i < len; i++){
            int step = nums[i] - nums[i-1];
            int temp = 2*i - len;
            count += (nums[i]-nums[0]);
            if((temp*step < 0)&&(flag == 0)){
                count += temp * step;
            }else if(temp*step > 0){
                flag = 1;
            }
        }
        return count;
    }
}