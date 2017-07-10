import java.util.HashMap;

public class Problem389 {
	public static void main(String[] args) {
		String s = "abcda";
		String t = "abcdaa";
		HashMap<Character, Integer> hashmap = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (hashmap.containsKey(s.charAt(i))) {
				hashmap.put(s.charAt(i), hashmap.get(s.charAt(i)) + 1);
			} else {
				hashmap.put(s.charAt(i), 1);
			}
		}
		char ans = '0';
		for (int i = 0; i < t.length(); i++) {
			if (hashmap.containsKey(t.charAt(i))) {
				if (hashmap.get(t.charAt(i)) > 0) {
					hashmap.put(t.charAt(i), hashmap.get(t.charAt(i)) - 1);
				} else {
					ans = t.charAt(i);
				}
			} else {
				ans = t.charAt(i);
			}
		}
		System.out.println(ans);
	}
}
