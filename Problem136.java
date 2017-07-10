import java.util.HashMap;
import java.util.Map;

public class Problem136 {
	public static void main(String[] args) {
		int[] nums = {1,2,3,2,3};
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				map.put(nums[i], 2);
			} else {
				map.put(nums[i], 1);
			}
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println(entry.getKey());
				break;
			}
		}
	}
}
