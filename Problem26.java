
public class Problem26 {
	public static void main(String[] args) {
		int[] nums = {1, 1, 2};
		int count = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[i - 1]) {
				nums[count] = nums[i];
				count++;
			}
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
}
