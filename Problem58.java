
public class Problem58 {
	public static void main(String[] args) {
		String s = " hello and ";
		int len = s.length();
		int start = 0;
		int end = 0;
		int ans = 0;
		boolean flag = false;
		for (int i = len - 1; i >= 0; i--) {
			if (!flag && s.charAt(i) != ' ') {
				flag = true;
				start = i;
			}
			if (flag && s.charAt(i) == ' ') {
				end = i;
				ans = start - end;
				break;
			}
			if (flag && i == 0) {
				end = 0;
				ans = start - end + 1;
				break;
			}
		}
		System.out.println(ans);
	}
}
