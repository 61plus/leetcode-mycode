
public class Problem189 {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		int len = nums.length;
		k = k % len;
		reverse(nums, 0, len - 1 - k);
		reverse(nums, len - k, len - 1);
		reverse(nums, 0, len - 1);
		for (int i = 0; i < len; i++) {
			System.out.println(nums[i]);
		}
	}
	public static void reverse(int[] nums, int start, int end) {
		while (start < end) {
			int tmp = nums[start];
			nums[start] = nums[end];
			nums[end] = tmp;
			start++;
			end--;
		}
	}
}
