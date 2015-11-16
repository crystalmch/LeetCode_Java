public class Solution{
    public int romanToInt(String s) {
        int result = 0;
        char[] sc;
        
        if(s == null){
            return result;
        }
        else{
            sc = s.toCharArray();
        }
        
        for(int i=0;i<sc.length;i++){
            int output=0;
            switch (sc[i]){
                case 'M':
                    output = 1000;
                    break;
                case 'D':
                    output = 500;
                    break;
                case 'L':
                    output = 50;
                    break;
                case 'V':
                    output = 5;
                    break;
                case 'C':
                    if ((i<sc.length-1) && (sc[i+1] == 'D' || sc[i+1] == 'M'))
                        output = -100;
                    else
                        output = 100; 
                    break;
                case 'X':
                    if ((i<sc.length-1) && (sc[i+1] == 'L' || sc[i+1] == 'C'))
                        output = -10;
                    else
                        output = 10;
                    break;
                case 'I':
                    if ((i<sc.length-1) && (sc[i+1] == 'V' || sc[i+1] == 'X'))
                        output = -1;
                    else
                        output = 1;
                    break;
            } 
            result += output;
        }        
        return result;
    }    
}