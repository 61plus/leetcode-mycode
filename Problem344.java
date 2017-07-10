
public class Problem344 {
	public static void main(String[] args) {
		String s = "a.";
		int len = s.length();
		if (s.isEmpty() || len == 1) {
			System.out.println(s);
		}
		char[] r = new char[len];
		for (int i = 0; i < len / 2; i++) {
			r[i] = s.charAt(len - 1 - i);
			r[len - 1 - i] = s.charAt(i);
		}
		if (len % 2 != 0) {
			r[len / 2] = s.charAt(len / 2);
		}
		System.out.println(new String(r));
	}
}
