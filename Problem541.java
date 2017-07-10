
public class Problem541 {
	public static void main(String[] args) {
		String s = "abcdefg";
		char[] chars = s.toCharArray();
		int k = 2;
		for (int i = 0; i < s.length(); i += 2 * k) {
			for (int j = i, l = Math.min(i + k - 1, s.length() - 1); j < l; j++, l--) {
				char tmp = chars[j];
				chars[j] = chars[l];
				chars[l] = tmp;
			}
		}
		System.out.println(new String(chars));
	}
}
