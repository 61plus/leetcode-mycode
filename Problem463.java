
public class Problem463 {
	public static void main(String[] args) {
		int[][] grid = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
		int countland = 0;
		int countside = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 1) {
					countland++;
					if (j + 1 < grid[0].length && grid[i][j + 1] == 1) {
						countside++;
					}
					if (i + 1 < grid.length && grid[i + 1][j] == 1) {
						countside++;
					}
				}
			}
		}
		int perimeter = 4 * countland - 2 * countside;
		System.out.println(perimeter);
	}
}
