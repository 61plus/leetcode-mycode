import java.util.ArrayList;
import java.util.List;

public class Problem119 {
	public static void main(String[] args) {
		int rowIndex = 3;
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		List<Integer> array = new ArrayList<>();
		array.add(1);
		list.add(new ArrayList<>(array));
		if (rowIndex == 0) {
			System.out.println(list.get(0));
		}
		array.add(1);
		list.add(new ArrayList<>(array));
		if (rowIndex == 1) {
			System.out.println(list.get(1));
		} else {
			for (int i = 2; i <= rowIndex; i++) {
				array.add(1);
				for (int j = 1; j < i; j++) {
					array.set(j, list.get(i - 1).get(j - 1) + list.get(i - 1).get(j));
				}
				list.add(new ArrayList<>(array));
			}
			System.out.println(list.get(rowIndex));
		}
	}
}
