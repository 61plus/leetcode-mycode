import java.util.ArrayList;
import java.util.List;

public class Problem442 {
	public static void main(String[] args) {
		int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
		int len = nums.length;
		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < len; i++) {
			int index = Math.abs(nums[i]) - 1;
			if (nums[index] > 0) {
				nums[index] = -nums[index];
			}
		}
		for (int i = 0; i < len; i++) {
			if (nums[i] > 0) {
				result.add(i + 1);
			} else {
				nums[i] = -nums[i];
			}
		}
		for (int i = 0; i < len; i++) {
			int index = Math.abs(nums[i]) - 1;
			nums[index] = -nums[index];
		}
		for (int i = 0; i < result.size(); i++) {
			int index = result.get(i) - 1;
			nums[index] = -nums[index];
		}
		result.clear();
		for (int i = 0; i < len; i++) {
			if (nums[i] > 0) {
				result.add(i + 1);
			}
		}
		System.out.println(result);
	}
}
