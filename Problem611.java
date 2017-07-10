import java.util.Arrays;

public class Problem611 {
	public static void main(String[] args) {
		int[] nums = {2, 2, 3, 4};
		if (nums.length < 3)
			System.out.println(0);
		Arrays.sort(nums);
		int count = 0;
		for (int i = 2; i < nums.length; i++) {
			int pointl = 0;
			int pointr = i - 1;
			while (pointl < pointr) {
				if (nums[pointl] + nums[pointr] > nums[i]) {
					count += (pointr - pointl);
					pointr--;
				} else {
					pointl++;
				}
			}
		}
		System.out.println(count);
	}
}
