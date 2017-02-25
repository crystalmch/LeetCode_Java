public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int len = numbers.length;
        int index = 0;
        int max = target - numbers[index];
        int[] res = new int[2];
        for(int i = len - 1; i > 0; i--){
            if(numbers[i] > max){
                continue;
            }else if(numbers[i] < max){
                index++;
                i++;
                max = target - numbers[index];
            }else{
                res[0] = index + 1;
                res[1] = i + 1;
                break;
            }
        }
        return res;
    }
}