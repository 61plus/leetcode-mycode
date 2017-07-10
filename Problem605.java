import java.util.ArrayList;
import java.util.List;

public class Problem605 {
	public static void main(String[] args) {
		int[] flowerbed = {1, 0, 0, 0, 0, 1};
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < flowerbed.length; i++) {
			if (flowerbed[i] == 1)
				list.add(i);
		}
		int empty = 0;
		for (int i = 0; i < list.size() - 1; i++) {
			int zeros = list.get(i + 1) - list.get(i) - 1;
			if (zeros > 0) {
				empty += (zeros - 1) / 2;
			}
		}
		System.out.println(empty);
	}
}
