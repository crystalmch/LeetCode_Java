import java.util.HashSet;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hash = new HashSet<Integer>();
        int len = nums.length; 
        for(int i=0;i<len;i++){
            if(hash.contains(nums[i])){
                return true;
            }else{
                hash.add(nums[i]);
            }
        }
        return false;
    }
}