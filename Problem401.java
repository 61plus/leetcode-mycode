import java.util.ArrayList;
import java.util.List;

public class Problem401 {
	public static void main(String[] args) {
		int num = 1;
		List<String> list = new ArrayList<>();
		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 60; j++) {
				if (Integer.bitCount(i) + Integer.bitCount(j) == num) {
					if (j < 10)
						list.add(i + ":0" + j);
					else
						list.add(i + ":" + j);
				}
			}
		}
		System.out.println(list);
	}
}
