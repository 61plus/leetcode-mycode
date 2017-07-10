import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Problem387 {
	public static void main(String[] args) {
		String s = "leetcodeleetcode";
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			} else {
				map.put(s.charAt(i), 1);
			}
		}
		System.out.println(map);
		int ans = -1;
		char anschar = '0';
		Iterator<Map.Entry<Character, Integer>> iter = map.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry<Character, Integer> entry = iter.next();
			if (entry.getValue() == 1) {
				anschar = entry.getKey();
				break;
			}
		}
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == anschar) {
				ans = i;
			}
		}
		System.out.println(ans);
	}
}
