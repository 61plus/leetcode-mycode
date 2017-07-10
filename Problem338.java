
public class Problem338 {
	public static void main(String[] args) {
		int num = 5;
		int[] result = new int[num + 1];
		for (int i = 0; i <= num; i++) {
			String str = Integer.toBinaryString(i);
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == '1') {
					count++;
				}
			}
			result[i] = count;
		}
		for (int i = 0; i <= num; i++) {
			System.out.println(result[i]);
		}
	}
}
