/***
 * 
 * @author July
 * Given an integer, convert it to a roman numeral.
 * Input is guaranteed to be within the range from 1 to 3999.
 */
public class Solution {
	public String substring(int n, String Low, String Mid, String High){
		String temp;
		switch (n){
			case 1: temp=Low; return temp;
			case 2: temp=Low+Low; return temp;
			case 3: temp=Low+Low+Low; return temp;
			case 4: temp=Mid+Low; return temp;
			case 5: temp=Mid; return temp;
			case 6: temp=Low+Mid; return temp;
			case 7: temp=Low+Low+Mid; return temp;
			case 8: temp=Low+Low+Low+Mid; return temp;
			case 9: temp=High+Low; return temp;
			default:return "";
		}
	}
	
    public String intToRoman(int num) {
        String result="";
        int temp=num;
        int digit=1;
        int i=0;
        while(digit<=4){
        	temp=num%10;
        	switch(digit){
        		case 1:result+=substring(temp,"I","V","X");break;
        		case 2:result+=substring(temp,"X","L","C");break;
        		case 3:result+=substring(temp,"C","D","M");break;
        		case 4:for(i=0;i<temp;i++) result+="M";
        	}
        	num=num/10;
        	digit++;
        }
        String reverse = new StringBuffer(result).reverse().toString();
        return reverse;
    }
    
    public static void main(String args[]){
    	int test=2014;
    	Solution my=new Solution();
    	String roman=my.intToRoman(test);
    	System.out.println(roman);
    }
}
