
public class Problem258 {
	public static void main(String[] args) {
		int num = 38;
		String numstr = Integer.toString(num);
		while (numstr.length() > 1) {
			int sum = 0;
			for (int i = 0; i < numstr.length(); i++) {
				sum += Character.getNumericValue(numstr.charAt(i));
			}
			numstr = Integer.toString(sum);
		}
		System.out.println(numstr);
	}
}
