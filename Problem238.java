
public class Problem238 {
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4};
		int len = nums.length;
		int[] result = new int[len];
		result[0] = 1;
		for (int i = 1; i < len; i++) {
			result[i] = result[i - 1] * nums[i - 1];
		}
		for (int i = len - 2; i >= 0; i--) {
			result[i] = result[i] * nums[i + 1];
			nums[i] = nums[i] * nums[i + 1];
		}
		for (int i = 0; i < len; i++) {
			System.out.println(result[i]);
		}
	}
}
