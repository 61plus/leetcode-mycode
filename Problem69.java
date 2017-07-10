
public class Problem69 {
	public static void main(String[] args) {
		int x = 6;
		int r = x;
		while (r * r > x) {
			r = (r + x / r) / 2;
		}
		System.out.println(r);
	}
}
