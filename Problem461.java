
public class Problem461 {
	public static void main(String[] args) {
		int x = 1;
		int y = 4;
		String binary = Integer.toBinaryString(x^y);
		System.out.println(binary);
		int count = 0;
		for (int i = 0; i < binary.length(); i++) {
			if (binary.charAt(i) == '1') {
				count++;
			}
		}
		System.out.println(count);
	}
}
