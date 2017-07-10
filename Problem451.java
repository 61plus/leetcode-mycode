import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Problem451 {
	public static void main(String[] args) {
		String s = "tree";
		Map<Character, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (hashMap.containsKey(s.charAt(i))) {
				hashMap.put(s.charAt(i), hashMap.get(s.charAt(i)) + 1);
			} else {
				hashMap.put(s.charAt(i), 1);
			}
		}
		Map<Integer, String> treeMap = new TreeMap<>();
		for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
			char key = entry.getKey();
			int val = entry.getValue();
			if (treeMap.containsKey(val)) {
				treeMap.put(val, treeMap.get(val) + key);
			} else {
				treeMap.put(val, "" + key);
			}
		}
		char[] chars = new char[s.length()];
		int count = 0;
		for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
			int key = entry.getKey();
			String val = entry.getValue();
			for (int i = 0; i < val.length(); i++) {
				for (int j = 0; j < key; j++) {
					chars[count] = val.charAt(i);
					count++;
				}
			}
		}
		String str = new String(chars);
		System.out.println(new StringBuffer(str).reverse().toString());
	}
}
