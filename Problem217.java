import java.util.HashMap;

public class Problem217 {
	public static void main(String[] args) {
		int[] nums = { 1, 1, 2, 3, 4 };
		HashMap<Integer, Integer> hashmap = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (hashmap.containsKey(nums[i])) {
				System.out.println(i);
			} else {
				hashmap.put(nums[i], 1);
			}
		}
	}
}
