
public class Problem172 {
	public static void main(String[] args) {
		int n = 10;
		int count = 0;
		if (n == 0)
			System.out.println(0);
		while (n > 0) {
			count += n / 5;
			n /= 5;
		}
		System.out.println(count);
	}
}
