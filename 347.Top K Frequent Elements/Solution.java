public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
		HashMap<Integer, Integer> hash = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (hash.containsKey(nums[i])) {
				int count = hash.get(nums[i]) + 1;
				hash.put(nums[i], count);
			} else {
				hash.put(nums[i], 1);
			}
		}
		List<Integer> mapValues = new ArrayList<>(hash.values());
		Collections.sort(mapValues);
		Integer index = mapValues.get(mapValues.size() - k);
		List<Integer> result = new ArrayList<Integer>();;
		for (Integer key : hash.keySet()) {
			if (hash.get(key) >= index) {
				result.add(key);
			}
		}
		return result;        
    }
}