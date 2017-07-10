
public class Problem476 {
	public static void main(String[] args) {
		int x = 1;
		String binary = Integer.toBinaryString(x);
		System.out.println(binary);
		String result = "";
		for (int i = 0; i < binary.length(); i++) {
			if (binary.charAt(i) == '0') {
				result += '1';
			} else {
				result += '0';
			}
		}
		System.out.println(Integer.valueOf(result, 2));
	}
}
