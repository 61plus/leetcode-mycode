import java.util.Arrays;

public class Problem561 {
	public static void main(String[] args) {
		int[] nums = {1,4,3,2};
		Arrays.sort(nums);
		int sum = 0;
		for (int i = nums.length - 2; i >= 0; i -= 2) {
			sum += nums[i];
		}
		System.out.println(sum);
	}
}
