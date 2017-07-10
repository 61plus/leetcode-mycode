import java.util.HashSet;
import java.util.Set;

public class Problem202 {
	public static void main(String[] args) {
		int n = 19;
		Set<Integer> set = new HashSet<>();
		while (!set.contains(n)) {
			set.add(n);
			int sum = 0;
			int remain = 0;
			while (n > 0) {
				remain = n % 10; 
				sum += remain * remain;
				n = n / 10;
			}
			if (sum == 1)
				System.out.println("true");
			else
				n = sum;
		}
		System.out.println("false");
	}
}
