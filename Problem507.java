import java.util.ArrayList;
import java.util.List;

public class Problem507 {
	public static void main(String[] args) {
		int num = 99999993;
		int sum = 0;
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				list.add(i);
				sum += i;
			}
		}
		System.out.println(list);
		System.out.println(sum);
	}
}
