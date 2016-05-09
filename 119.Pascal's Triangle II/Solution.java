import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<Integer> getRow(int rowIndex) {
		List<Integer> list = new ArrayList<Integer>();
		int[] row = new int[rowIndex + 1];
		Arrays.fill(row, 0);
		for (int i = 0; i <= rowIndex; i++) {
			row[i] = 1;
			if (rowIndex > 1) {
				for (int j = i - 1; j > 0; j--) {
					row[j] += row[j - 1];
				}
			}
		}
		for (int index = 0; index <= rowIndex; index++) {
			list.add(row[index]);
		}
		return list;        
    }
}