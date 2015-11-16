import java.util.HashSet;

public class Solution {
    public int[] singleNumber(int[] nums) {
        int[] array = new int[2];
        HashSet<Integer> hash = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!hash.contains(nums[i])){
                hash.add(nums[i]);
            }else{
                hash.remove(nums[i]);
            }
        }
        int j=0;
        for(Integer value: hash){
            array[j++]=value;
        }
        return array;
    }
}