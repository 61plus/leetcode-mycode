import java.util.ArrayList;

public class Problem283 {
	public static void main(String[] args) {
		int[] nums = { 0, 1, 0, 3, 12 };
		ArrayList<Integer> array = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				array.add(nums[i]);
			}
		}
		for (int i = 0; i < array.size(); i++) {
			nums[i] = array.get(i);
		}
		for (int i = array.size(); i < nums.length; i++) {
			nums[i] = 0;
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
}
