
public class Problem551 {
	public static void main(String[] args) {
		String s = "PPALLL";
		int anum = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'A') {
				anum++;
			}
			if (s.charAt(i) == 'L') {
				if (i + 2 < s.length() && s.charAt(i + 1) == 'L' && s.charAt(i + 2) == 'L') {
					System.out.println("false");
				}
			}
		}
		if (anum > 1) {
			System.out.println("false");
		}
		System.out.println("true");
	}
}
