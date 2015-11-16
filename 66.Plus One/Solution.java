public class Solution {
    public int[] plusOne(int[] digits) {
        int m=digits.length;
        int carry=1;
        for(int i=m-1;i>=0;i--){
        	if((digits[i]==9)&&(carry==1)){
        		digits[i]=0;
        		carry=1;
        	}
        	else if(carry==1){
        		digits[i]++;
        		carry=0;
        	}
        	else{
        		carry=0;
        	}
        }
        int array[]=new int[m+carry];
        if(carry==1) array[0]=1;
        for(int i=m-1;i>=0;i--){
        	array[i+carry]=digits[i];
        }
        return array;
    }
    
    public static void main(String args[]){
    	int[] array={1,2,3};
    	Solution my=new Solution();
    	int[] result=my.plusOne(array);
    	for(int i=0;i<result.length;i++){
    		System.out.print(result[i] + ", ");
    	}
    }
}