public class Solution {
    public boolean isHappy(int n) {
        if(n <= 0){
            return false;
        }
        int temp = n;
        while(temp!=1){
            int res = 0;
            int bit = 0;
            while(temp!= 0){
                bit = temp % 10;
                res += (bit*bit);
                temp = temp/10;
            }
            temp = res;
            if(res < 9){
                if((res==7)||(res==1)) 
                    return true;
                else
                    return false;
            }
        }
        return true;
    }
}