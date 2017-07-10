
public class Problem405 {
	public static void main(String[] args) {
		int num = -1;
		String result = "";
		char[] hex = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
		while (num != 0) {
			result = hex[num & 15] + result;
			num = num >>> 4;
		}
		System.out.println(result);
	}
}
