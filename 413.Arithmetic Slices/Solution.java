public class Solution {
    public boolean inRow(int i, int[] A){
        if( 2*A[i+1] == A[i] + A[i+2]) return true;
        return false;
    }
    
    public int numberOfArithmeticSlices(int[] A) {
        int m = A.length;
        int count = 0;
        Solution sol = new Solution();
        if(m < 3) return count;
        int head = 0;
        int tail = 0;
        int temp = 0;
        for(int i = 0; i < m-2; i++){
            if(sol.inRow(i, A)){
                if(head == tail){
                    tail = head + 2;
                }else{
                    tail = i + 2;
                }
            }else{
                if(head == tail){
                    head++;
                    tail++;
                }else{
                    temp = 1;
                }
            }
            if((temp == 1)||(tail == m - 1)){
                temp = tail - head;
                count += temp*(temp-1)/2;
                temp = 0;
                head = tail = i + 1;
            }
        }
        return count;
    }
}