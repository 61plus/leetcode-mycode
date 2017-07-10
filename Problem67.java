import java.util.ArrayList;

public class Problem67 {
	public static void main(String[] args) {
		String a = "1111";
		String b = "1111";
		int lena = a.length();
		int lenb = b.length();
		ArrayList<Integer> array = new ArrayList<>();
		int carry = 0;
		for (int i = lena - 1, j = lenb - 1; i >= 0 || j >= 0; i--, j--) {
			int sum = carry;
			if (i >= 0) {
				sum += (a.charAt(i) - '0');
			}
			if (j >= 0) {
				sum += (b.charAt(j) - '0');
			}
			array.add(sum % 2);
			carry = (sum >= 2 ? 1 : 0);
		}
		if (carry == 1) {
			array.add(carry);
		}
		String result = "";
		for (int i = array.size() - 1; i >= 0; i--) {
			result += array.get(i);
		}
		System.out.println(result);
	}
}
