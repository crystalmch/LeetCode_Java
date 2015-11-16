public class Solution {
	
    public int singleNumber(int[] A) {
    	int m=A.length;
    	
    	for(int i=1;i<m;i++){
    		A[0] ^= A[i];
    	}
    	
    	return A[0];
    }
    
    public static void main(String args[]){
    	int[] array = {1,2,4,1,3,2,4};
    	Solution mysolution=new Solution();
    	int result = mysolution.singleNumber(array);
    	System.out.println(result);
    }
}
