import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Problem409 {
	public static void main(String[] args) {
		String s = "abccccdd";
		HashMap<Character, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (hashMap.containsKey(s.charAt(i))) {
				hashMap.put(s.charAt(i), hashMap.get(s.charAt(i)) + 1);
			} else {
				hashMap.put(s.charAt(i), 1);
			}
		}
		int len = 0;
		ArrayList<Character> array = new ArrayList<>();
		for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
			char key = entry.getKey();
			int value = entry.getValue();
			if (value > 1) {
				if (value % 2 == 0) {
					len += value;
					array.add(key);
				} else {
					len += (value - 1);
					hashMap.put(key, 1);
				}
			}
		}
		for (int i = 0; i < array.size(); i++) {
			hashMap.remove(array.get(i));
		}
		if (!hashMap.isEmpty()) {
			len++;
		}
		System.out.println(len);
	}
}
