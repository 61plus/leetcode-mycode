import java.util.HashMap;
import java.util.Map;

public class Problem594 {
	public static void main(String[] args) {
		int[] nums = { 1, 1, 1, 1 };
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}
		int max = 0;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			int key = entry.getKey();
			int val = entry.getValue();
			if (map.containsKey(key + 1) && val + map.get(key + 1) > max) {
				max = val + map.get(key + 1);
			}
		}
		System.out.println(max);
	}
}
