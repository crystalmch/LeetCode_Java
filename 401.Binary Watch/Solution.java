import java.lang.Math; 
public class Solution {
	public int countBits(int n){
		int count = 0;
		while(n != 0){
			n &= (n-1);
			count++;
		}
		return count;
	}

	public List<Integer> findBound(int num, int digit, int bound){
		Solution sol = new Solution();
		int max = ((byte) Math.pow(2, num) - 1) << (digit-num);
		max = Math.min(max, bound);
		List<Integer> list = new ArrayList<Integer>();
		for(int j = max; j >= 0; j--){
			if(sol.countBits(j) == num){
				list.add(j);
			}
		}
		return list;
		
	}

	public List<String> findTime(int hrs, int min){
		List<String> list = new ArrayList<String>();
		Solution sol = new Solution();
		List<Integer> m = sol.findBound(hrs, 4, 11);
		List<Integer> n = sol.findBound(min, 6, 59);
		int ml = m.size();
		int nl = n.size();
		for(int i = 0; i < ml; i++){
			for(int j = 0; j < nl; j++){
				String temp = "" + m.get(i) + ":" + String.format("%02d", n.get(j));
				list.add(temp);
			}
		}
		return list;
	}

    public List<String> readBinaryWatch(int num) {
        List<String> list = new ArrayList<String>();
        Solution sol = new Solution();
        if(num > 8){
        	return list;	
        }else{
        	for(int i = 0; i <= Math.min(num, 5); i++){
        		if((num - i) > 3){
        			continue;
        		}else{
        			list.addAll(sol.findTime(num - i, i));
        		}
        	}
        }
        return list;        
    }
}