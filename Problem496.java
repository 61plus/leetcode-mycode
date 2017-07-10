
public class Problem496 {
	public static void main(String[] args) {
		int[] findNums = {2, 4};
		int len = findNums.length;
		int[] nums = {1, 2, 3, 4};
		int[] result = new int[len];
		for (int i = 0; i < len; i++) {
			boolean flag = false;
			for (int j = 0; j < nums.length; j++) {
				if (!flag && findNums[i] == nums[j]) {
					flag = true;
					if (j == nums.length - 1) {
						result[i] = -1;
						break;
					}
					continue;
				}
				if (flag && findNums[i] < nums[j]) {
					result[i] = nums[j];
					break;
				}
				if (flag && j == nums.length - 1) {
					result[i] = -1;
					break;
				}
			}
		}
		for (int i = 0; i < len; i++) {
			System.out.println(result[i]);
		}
	}
}
