import java.util.Set;
import java.util.TreeSet;

public class Problem532 {
	public static void main(String[] args) {
		int[] nums = {1, 3, 1, 4, 5};
		int k = 2;
		int count = 0;
		Set<Integer> set = new TreeSet<>();
		for (int i = 0; i < nums.length; i++) {
			set.add(nums[i]);
		}
		System.out.println(set);
		int[] nums1 = new int[set.size()];
		int numid = 0;
		for (int num : set) {
			nums1[numid] = num;
			numid++;
		}
		for (int i = 0; i < nums1.length - 1; i++) {
			for (int j = i + 1; j < nums1.length; j++) {
				if (Math.abs(nums1[i] - nums1[j]) == k) {
					count++;
					System.out.println(i + "," + j);
				}
			}
		}
		System.out.println(count);
	}
}
