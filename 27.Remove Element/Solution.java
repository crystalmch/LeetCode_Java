public class Solution {
	
	public int removeElement(int[] A, int elem) {
    	int m=A.length;
    	int n=m;
    	if(m==0) return 0;
    	for(int i=0;i<n;i++){
    		if((elem==A[i])&&(n>0)){
    			for(int j=n-1;j>i;j--){
    			    if(elem==A[j]) 
    			        n--;
    				else{
    					A[i]=A[j];
    					break;}
    			}
    			n--;
    		}
    	}
    	return n;
    }
    
    public static void main(String args[]){
    	int[] A={2,3,3};
    	Solution my=new Solution();
    	int result=my.removeElement(A,3);
    	System.out.println(result);
    }
}