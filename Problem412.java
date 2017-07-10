import java.util.ArrayList;
import java.util.List;

public class Problem412 {
	public static void main(String[] args) {
		int n = 15;
		List<String> result = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 5 != 0) {
				result.add("Fizz");
				continue;
			}
			if (i % 5 == 0 && i % 3 != 0) {
				result.add("Buzz");
				continue;
			}
			if (i % 3 == 0 && i % 5 == 0) {
				result.add("FizzBuzz");
				continue;
			}
			result.add(i + "");
		}
		System.out.println(result);
	}
}
