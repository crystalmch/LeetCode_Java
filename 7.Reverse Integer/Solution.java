public class Solution {
    public int reverse(int x) {
    	int temp=x;
    	int flag=1;
    	int result=0;
    	if(x<0){
    		flag=-1;
    		if(x==-2147483648) {return 0;}
    		temp=-x;
    	}
    	int width=String.valueOf(temp).length();
		int[] digit=new int[width];
		
		for(int i=0;i<width-1;i++){
			result*=10; 
			digit[i]=temp%10;
			temp=temp/10;
			result+=digit[i];
		}
		if(width==10){
			int j=result-214748364;
			if(j==0&&temp>7) return 0;
			else if(j>0) return 0;
			else;
		}
		result*=10;
		digit[width-1]=temp;
		result+=digit[width-1];
		result=result*flag;
		
		return result;
    }
    
    public static void main(String args[]){
    	int x=-2147483648;
    	Solution mysolution=new Solution();
    	int result=mysolution.reverse(x);
    	System.out.println(result);
    } 
}
