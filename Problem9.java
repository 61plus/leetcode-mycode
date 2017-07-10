
public class Problem9 {
	public static void main(String[] args) {
		int x = 123421;
		String s = Integer.toString(x);
		int left = 0;
		int right = s.length() - 1;
		while (left < right) {
			if (s.charAt(left) != s.charAt(right)) {
				System.out.println("false");
				break;
			}
			left++;
			right--;
		}
		System.out.println("true");
	}
}
