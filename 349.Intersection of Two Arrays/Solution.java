public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int m = nums1.length;
        int n = nums2.length;
        List<Integer> list =new ArrayList<Integer>();
        int i = 0, j =0, k = 0, last = 0;
        for(;(i < m)&&(j < n);){
            if(nums1[i] == nums2[j]){
                if(k == 0){
                    k++;
                    list.add(nums1[i]);
                    last = nums1[i];
                }else if(nums1[i] > last){
                    k++;
                    list.add(nums1[i]);
                    last = nums1[i];
                }
                i++;
                j++;
            }else if(nums1[i] < nums2[j]){
                i++;
            }else{
                j++;
            }
        }
        k = list.size();
        int[] res = new int[k];
        for(k = k - 1;k >= 0; k--){
            res[k] = list.get(k).intValue();
        }
        return res;
    }
}