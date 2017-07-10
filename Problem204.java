
public class Problem204 {
	public static void main(String[] args) {
		int n = 3;
		boolean[] flag = new boolean[n];
		int count = 0;
		for (int i = 2; i < n; i++) {
			if (!flag[i]) {
				count++;
				for (int j = 2; i * j < n; j++) {
					flag[i * j] = true;
				}
			}
		}
		System.out.println(count);
	}
}
