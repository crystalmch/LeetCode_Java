public class Solution {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		if (n == 0)
			return;
		for (int i = 0, j = 0; (i < m) && (j < n);) {
			if (nums1[i] > nums2[j]) {
				int temp = nums2[j];
				nums2[j] = nums1[i];
				nums1[i] = temp;
				Arrays.sort(nums2);
			}
			i++;
		}
		System.arraycopy(nums2, 0, nums1, m, nums2.length);
	}
}