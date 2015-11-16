import java.util.HashMap;

public class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        int max=0;
        int maxcount=0;
        for(int i=0;i<nums.length;i++){
            int j=nums[i];
            int count = hash.containsKey(j) ? hash.get(j) : 0;
            if(count > maxcount){
                maxcount = count;
                max = j;
            }
            if(count >= nums.length/2){
                return j;
            }
            hash.put(j, count + 1);
        }
        return max;
    }
}