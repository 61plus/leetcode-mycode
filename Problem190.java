
public class Problem190 {
	public static void main(String[] args) {
		int n = 43261596;
		int result = 0;
		for (int i = 0; i < 32; i++) {
			result = result << 1;
			if ((n & 1) == 1)
				result++;
			n = n >> 1;
		}
		System.out.println(result);
	}
}
