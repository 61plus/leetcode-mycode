import java.util.Arrays;

public class Problem455 {
	public static void main(String[] args) {
		int[] g = {1,2};
		int[] s = {1,2,3};
		Arrays.sort(g);
		Arrays.sort(s);
		int count = 0;
		for (int i = 0; i < s.length && count < g.length; i++) {
			if (s[i] >= g[count]) {
				count++;
			}
		}
		System.out.println(count);
	}
}
