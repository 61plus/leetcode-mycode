
public class Problem485 {
	public static void main(String[] args) {
		int[] nums = { 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1 };
		int len = nums.length;
		int count = 0;
		int max = 0;
		for (int i = 0; i < len; i++) {
			if (nums[i] == 1) {
				count++;
				if (i == len - 1 && count > max) {
					max = count;
				}
			} else {
				if (count > max) {
					max = count;
				}
				count = 0;
			}
		}
		System.out.println(max);
	}
}
