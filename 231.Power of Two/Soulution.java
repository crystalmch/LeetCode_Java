public class Solution {
    public boolean isPowerOfTwo(int n) {
        int count = 0;
        if(n == 0){
            return false;
        }else{
            int bit;
            while(n!=0){
                bit = n%2;
                n /= 2;
                if(bit == 1){
                    count++;
                }
            }
        }
        if(count == 1){
            return true;
        }
        return false;
    }
}