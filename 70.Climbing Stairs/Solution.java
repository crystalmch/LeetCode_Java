public class Solution {
	public int climbStairs(int n) {
        if(n<2) return 1;
        int a=n/2;
        int b=n%2;
        int result=0;
        if(b==0){
        	a-=1;
        	b+=2;
        	result++;
        }
        while(a>0){
            Solution my=new Solution();
        	if(a>b) result+=(int)my.helper(a,b);
        	else result+=(int)my.helper(b,a);
        	a-=1;
        	b+=2;
        }
        return ++result;
    }
    
	public long helper(int m,int n){
		long temp=1;
		long q=1;
		int count=0;
		for(int i=m+n,j=1;i>m;i--,j++){
			q*=j;
			temp*=i;
			count++;
			if(count==2){ 
				temp/=q;
				q=1;
				count=0;
			}
		}
		temp/=q;
		return temp;
	}
	
    public static void main(String args[]){
    	int array=44;
    	Solution my=new Solution();
    	int result=my.climbStairs(array);
    	System.out.print(result);
    }
}