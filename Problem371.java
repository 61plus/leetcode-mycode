
public class Problem371 {
	public static void main(String[] args) {
		int a = 7;
		int b = 6;
		while (b != 0) {
			int carry = a & b;
			System.out.println(carry);
			a = a ^ b;
			System.out.println(a);
			b = carry << 1;
			System.out.println(b);
		}
	}
}
