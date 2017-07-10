import java.util.HashMap;

public class Problem242 {
	public static void main(String[] args) {
		String s = "anagram";
		String t = "nagaram";
		if (s.length() != t.length()) {
			System.out.println("false.");
		}
		HashMap<Character, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (hashMap.containsKey(s.charAt(i))) {
				hashMap.put(s.charAt(i), hashMap.get(s.charAt(i)) + 1);
			} else {
				hashMap.put(s.charAt(i), 1);
			}
		}
		for (int i = 0; i < t.length(); i++) {
			if (hashMap.containsKey(t.charAt(i))) {
				if (hashMap.get(t.charAt(i)) > 1) {
					hashMap.put(t.charAt(i), hashMap.get(t.charAt(i)) - 1);
				} else {
					hashMap.remove(t.charAt(i));
				}
			} else {
				System.out.println("false.");
			}
		}
		System.out.println("true.");
	}
}
