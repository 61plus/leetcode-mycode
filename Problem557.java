
public class Problem557 {
	public static void main(String[] args) {
		String s = "Let's take LeetCode contest";
		String[] array = s.split(" ");
		char[] result = new char[s.length()];
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = array[i].length() - 1; j >= 0; j--) {
				result[count++] = array[i].charAt(j); 
			}
			if (i < array.length - 1) {
				result[count++] = ' ';
			}
		}
		System.out.println(new String(result));
	}
}
