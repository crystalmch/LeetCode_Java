public class Solution {
	public int removeDuplicates(int[] A) {
	    int n=A.length;
        int id = 1;
        if(n<2) return n;
        for(int i = 1; i < n; ++i) 
            if(A[i] != A[i-1]) A[id++] = A[i];
        return id;
	}
	
	public static void main(String args[]){
		int[] array={1,1,1};
		Solution my=new Solution();
		int size=my.removeDuplicates(array);
		System.out.println(size);
		for(int i=0;i<size;i++){
			System.out.println(array[i]);
		}
	}
}