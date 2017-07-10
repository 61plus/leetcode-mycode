
public class Problem598 {
	public static void main(String[] args) {
		int m = 3;
		int n = 3;
		int[][] ops = {{2, 2}, {3, 3}};
		if (ops == null || ops.length == 0) {
			System.out.println(m * n);
		}
		int mina = Integer.MAX_VALUE;
		int minb = Integer.MAX_VALUE;
		for (int i = 0; i < ops.length; i++) {
			if (ops[i][0] < mina)
				mina = ops[i][0];
			if (ops[i][1] < minb)
				minb = ops[i][1];
		}
		System.out.println(mina * minb);
	}
}
