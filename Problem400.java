
public class Problem400 {
	public static void main(String[] args) {
		int n = 2147483647;
		int len = 1;
		long count = 9;
		int start = 1;
		while (n > len * count) {
			n -= len * count;
			len++;
			count *= 10;
			start *= 10;
		}
		int num = start - 1;
		if (n % len == 0) {
			num += n / len;
			System.out.println(num % start);
		} else {
			num += n / len + 1;
			System.out.println(String.valueOf(num).charAt(n % len - 1) - '0');
		}
	}
}
