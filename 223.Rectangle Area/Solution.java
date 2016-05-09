public class Solution {
	public int commonLen(int A, int C, int E, int G) {
		if ((C <= E) || (G <= A))
			return 0;
		int left = (E > A) ? E : A;
		int right = (G < C) ? G : C;
		return right - left;
	}

	public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
		Solution sol = new Solution();
		int length = sol.commonLen(A, C, E, G);
		int height = sol.commonLen(B, D, F, H);
		int total = (C - A) * (D - B) + (G - E) * (H - F);
		return total - length * height;
	}      
}