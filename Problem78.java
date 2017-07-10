import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem78 {
	
	private static void backtrack(List<List<Integer>> list, List<Integer> tmp, int[] nums, int start) {
		list.add(new ArrayList<>(tmp));
		for (int i = start; i < nums.length; i++) {
			tmp.add(nums[i]);
			backtrack(list, tmp, nums, i + 1);
			tmp.remove(tmp.size() - 1);
		}
	}
	
	public static void main(String[] args) {
		int[] nums = {1, 2, 3};
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(nums);
		backtrack(list, new ArrayList<>(), nums, 0);
		System.out.println(list);
	}
	
}
