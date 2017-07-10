import java.util.ArrayList;
import java.util.List;

public class Problem118 {
	public static void main(String[] args) {
		int numRows = 5;
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		List<Integer> array = new ArrayList<>();
		if (numRows == 0) {
		    System.out.println(list);
		}
		array.add(1);
		list.add(new ArrayList<>(array));
		if (numRows == 1) {
			System.out.println(list);
		}
		array.add(1);
		list.add(new ArrayList<>(array));
		if (numRows == 2) {
			System.out.println(list);
		} else {
			for (int i = 2; i < numRows; i++) {
				array.add(1);
				for (int j = 1; j < i; j++) {
					array.set(j, list.get(i - 1).get(j - 1) + list.get(i - 1).get(j));
				}
				list.add(new ArrayList<>(array));
			}
		}
		System.out.println(list);
	}
}
