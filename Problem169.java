import java.util.HashMap;

public class Problem169 {
	public static void main(String[] args) {
		int[] nums = { 1 };
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i]) + 1);
			} else {
				map.put(nums[i], 1);
			}
			if (map.get(nums[i]) > nums.length / 2) {
				System.out.println(nums[i]);
			}
		}
	}
}
