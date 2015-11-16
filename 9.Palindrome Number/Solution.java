public class Solution {
    public boolean isPalindrome(int x) {
        Solution sol = new Solution();
        if(x < 0) {
            return false;
        }
        if(x < 10) return true;
        int last_half;
        int first_half;
        int temp = x;
        int count = 0;
        while(temp > 0){
            temp = temp/10;
            count ++;
        }
        first_half = (int)((double)x*Math.pow(10,(int)(count/2-count)));
        last_half = x%(int)Math.pow(10,(int)(count/2));
        if(first_half<10){
            if(first_half == last_half) return true;
            return false;
        }
        count = count/2;
        temp = first_half;
        int compare = last_half;
        int flag = 1;
        while((temp > 0)&&(flag == 1)&&(count!=0)){
            int test = temp%10;
            if(test == 0) {
                if(compare< (int)Math.pow(10,count-1)){
                    flag = 1;
                }else{
                    flag = 0;
                }
            }else if(test != 0){
                if(test == compare/(int)Math.pow(10,count-1)){
                    flag = 1;
                    compare = compare-test*(int)Math.pow(10,count-1);
                }else{
                    flag = 0;
                }
            }
            count--;
            temp = temp/10;
        }
        if(flag == 1) return true;
        return false;
    }
}