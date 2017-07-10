
public class Problem434 {
	public static void main(String[] args) {
		String s = " ";
		boolean flag = false;
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (!flag && s.charAt(i) != ' ') {
				flag = true;
			}
			if (flag && s.charAt(i) == ' ') {
				count++;
				flag = false;
			}
			if (flag && i == s.length() - 1) {
				count++;
			}
		}
		System.out.println(count);
	}
}
