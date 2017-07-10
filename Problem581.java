import java.util.Arrays;

public class Problem581 {
	public static void main(String[] args) {
		int[] nums = {2, 6, 4, 8, 10, 9, 15};
		int[] copy = nums.clone();
		Arrays.sort(copy);
		int start = 0;
		int end = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != copy[i]) {
				start = i;
				break;
			}
		}
		for (int i = nums.length - 1; i >= 0; i--) {
			if (nums[i] != copy[i]) {
				end = i;
				break;
			}
		}
		System.out.println(end - start + 1);
	}
}
