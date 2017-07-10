
public class Problem441 {
	public static void main(String[] args) {
		int n = 15;
		int count = 0;
		while (n - count >= count + 1) {
			n -= count;
			count++;
		}
		System.out.println(count);
	}
}
