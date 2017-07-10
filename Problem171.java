
public class Problem171 {
	public static void main(String[] args) {
		String s = "AB";
		int len = s.length();
		int[] columns = new int[len];
		int ans = 0;
		for (int i = 0; i < len; i++) {
			columns[i] = Integer.valueOf(s.charAt(i)) - 64;
			ans += Math.pow(26, len - 1 - i) * columns[i];
		}
		System.out.println(ans);
	}
}
