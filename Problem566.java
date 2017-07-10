import java.util.ArrayList;

public class Problem566 {
	public static void main(String[] args) {
		int[][] nums = { { 1, 2 }, { 3, 4 } };
		int r = 1;
		int c = 4;
		int row = nums.length;
		int col = nums[0].length;
		if (r * c != row * col) {
			System.out.println("illegal");
		}
		ArrayList<Integer> array = new ArrayList<>();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				array.add(nums[i][j]);
			}
		}
		int[][] result = new int[r][c];
		int count = 0;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				result[i][j] = array.get(count);
				count++;
			}
		}
	}
}
