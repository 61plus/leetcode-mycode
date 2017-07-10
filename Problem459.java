
public class Problem459 {
	public static void main(String[] args) {
		String s = "abcabcabcabc";
		int len = s.length();
		for (int i = len / 2 ; i > 0; i--) {
			if (len % i == 0) {
				String repeat = s.substring(0, i);
				StringBuilder sb = new StringBuilder();
				for (int j = 0; j < len / i; j++) {
					sb.append(repeat);
				}
				if (sb.toString().equals(s)) {
					System.out.println(repeat);
					break;
				}
			}
		}
	}
}
