
public class Problem191 {
	public static void main(String[] args) {
		int n = 11;
		int count = 0;
		for (int i = 0; i < 32; i++) {
			if ((n & 1) == 1) {
				count++;
			}
			n = n >> 1;
		}
		System.out.println(count);
	}
}
