import java.util.HashMap;

public class Problem205 {
	public static void main(String[] args) {
		String s = "paper";
		String t = "title";
		int len = s.length();
		HashMap<Character, Integer> map1 = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();
		for (Integer i = 0; i < len; i++) {
			if (map1.put(s.charAt(i), i) != map2.put(t.charAt(i), i)) {
				System.out.println("false");
			}
		}
		System.out.println("true");
	}
}
