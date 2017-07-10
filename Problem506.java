import java.util.Arrays;
import java.util.HashMap;

public class Problem506 {
	public static void main(String[] args) {
		int[] nums = { 1, 3, 2 };
		int[] copy = nums.clone();
		Arrays.sort(copy);
		int len = nums.length;
		HashMap<Integer, String> map = new HashMap<>();
		map.put(copy[len - 1], "Gold Medal");
		if (len >= 2) {
			map.put(copy[len - 2], "Silver Medal");
		}
		if (len >= 3) {
			map.put(copy[len - 3], "Bronze Medal");
		}
		if (len >=4 ) {
			for (int i = len - 4; i >= 0; i--) {
				map.put(copy[i], Integer.toString(len - i));
			}
		}
		String[] result = new String[len];
		for (int i = 0; i < len; i++) {
			result[i] = map.get(nums[i]);
			System.out.println(result[i]);
		}
	}
}
