import java.util.ArrayList;
import java.util.List;

public class Problem448 {
	public static void main(String[] args) {
		int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
		int len = nums.length;
		List<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < len; i++) {
			int index = Math.abs(nums[i]) - 1;
			//只加一次负号
			if (nums[index] > 0) {
				nums[index] = -nums[index];
			}
		}
		for (int i = 0; i < len; i++) {
			if (nums[i] > 0) {
				result.add(i + 1);
			}
		}
		System.out.println(result);
	}
}
