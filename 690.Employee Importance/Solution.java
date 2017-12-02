import java.util.List;

class Solution {
	public int getImportance(List<Employee> employees, int id) {
		Employee temp = new Employee();
		int sum = 0;
		for (int i = 0; i < employees.size(); i++) {
			temp = employees.get(i);
			if (temp.id == id) {
				List<Integer> sub = temp.subordinates;
				sum = temp.importance;
				for (int j = 0; j < sub.size(); j++) {
					Solution sol = new Solution();
					sum = sum + sol.getImportance(employees, sub.get(j));
				}
			}
		}
		return sum;
	}
}