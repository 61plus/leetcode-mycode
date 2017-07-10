
public class Problem88 {
	public static void main(String[] args) {
		int[] nums1 = {2, 4, 6, 8, 0, 0, 0, 0, 0};
		int m = 4;
		int[] nums2 = {1, 3, 5, 7, 9};
		int n = 5;
		int i = m - 1;
		int j = n - 1;
		int k = m + n - 1;
		while (i >= 0 && j >= 0) {
			if (nums1[i] > nums2[j]) {
				nums1[k] = nums1[i];
				k--;
				i--;
			} else {
				nums1[k] = nums2[j];
				k--;
				j--;
			}
		}
		while (j >= 0) {
			nums1[k] = nums2[j];
			k--;
			j--;
		}
		for (i = 0; i < nums1.length; i++) {
			System.out.println(nums1[i]);
		}
	}
}
