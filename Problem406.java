import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Problem406 {
	public static void main(String[] args) {
		int[][] people = {{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}};
		Arrays.sort(people, new Comparator<int[]>() {
			public int compare(int[] p1, int[] p2) {
				return p1[0] == p2[0] ? Integer.compare(p1[1], p2[1]) : Integer.compare(p2[0], p1[0]);
			}
		});
		List<int[]> list = new LinkedList<>();
		for (int[] tmp : people) {
			list.add(tmp[1], tmp);
		}
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.get(i).length; j++) {
				System.out.print(list.get(i)[j] + "\t");
			}
			System.out.println();
		}
	}
}
