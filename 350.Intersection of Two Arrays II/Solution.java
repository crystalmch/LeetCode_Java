public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
 		int len1 = nums1.length;
 		int len2 = nums2.length;
 		Arrays.sort(nums1);
 		Arrays.sort(nums2);
 		int i = 0, j = 0;
 		ArrayList<Integer> list = new ArrayList<Integer>();
 		while((i < len1) &&(j < len2)){
 			if(nums1[i] == nums2[j]){
 				list.add(nums1[i]);
 				i++;
 				j++;
 			}else if(nums1[i] < nums2[j]){
 				i++;
 			}else{
 				j++;
 			}
 		}
 		int[] ret = new int[list.size()];
    	for (i=0; i < ret.length; i++)
    	{
        	ret[i] = list.get(i).intValue();
    	}
    	return ret;
    }
}