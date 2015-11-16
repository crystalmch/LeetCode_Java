/**
* Solution:
* DP
* a BST can be destruct to root, left subtree and right subtree.
* if the root is fixed, every combination of unique left/right subtrees forms
* a unique BST.
* Let a[n] = number of unique BST's given values 1..n, then
* a[n] = a[0] * a[n-1]     // put 1 at root, 2...n right
*      + a[1] * a[n-2]     // put 2 at root, 1 left, 3...n right
*      + ...
*      + a[n-1] * a[0]     // put n at root, 1...n-1 left
*/
public class Solution {
	public int numTrees(int n) {
	    if (n<0) return 0;
	    int[] trees=new int[n+1];
	    trees[0] = 1;

	    for(int i = 1; i <= n; i++) 
	        for (int j = 0; j < i; j++) 
	            trees[i] += trees[j] * trees[i-j-1];

	    return trees[n];
	}
	
	public static void main(String args[]){
		int nodenum=5;
		Solution my=new Solution();
		int result=my.numTrees(nodenum);
		System.out.println(result);
	}
}