
public class Problem38 {
	public static void main(String[] args) {
		int n = 5;
		StringBuilder sb = new StringBuilder("1");
		StringBuilder last = new StringBuilder();
		for (int i = 1; i < n; i++) {
			last.setLength(0);
			last.append(sb.toString());
			sb.setLength(0);
			int count = 0;
			char c = last.charAt(0);
			for (int j = 0; j < last.length(); j++) {
				if (last.charAt(j) == c) {
					count++;
				} else {
					sb.append(count);
					sb.append(c);
					count = 1;
					c = last.charAt(j);
				}
				if (j == last.length() - 1) {
					sb.append(count);
					sb.append(c);
				}
			}
		}
		System.out.println(sb.toString());
	}
}
