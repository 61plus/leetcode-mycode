
public class Problem167 {
	public static void main(String[] args) {
		int[] numbers = { 2, 7, 11, 15 };
		int target = 9;
		int len = numbers.length;
		int low = 0;
		int high = len - 1;
		int[] indices = new int[2];
		while (low < high) {
			if (numbers[low] + numbers[high] < target) {
				low++;
			} else if (numbers[low] + numbers[high] > target) {
				high--;
			} else {
				indices[0] = low + 1;
				indices[1] = high + 1;
				break;
			}
		}
		System.out.println(indices[0] + "," + indices[1]);
	}
}
