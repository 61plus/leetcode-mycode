
public class Problem168 {
	public static void main(String[] args) {
		int n = 27;
		StringBuilder sb = new StringBuilder();
		while(n > 0) {
			n--;
			sb.insert(0, (char)(n % 26 + 'A'));
			n /= 26;
		}
		System.out.println(sb.toString());
	}
}
