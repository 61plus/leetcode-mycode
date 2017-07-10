import java.util.HashMap;

public class Problem290 {
	public static void main(String[] args) {
		String pattern = "ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccdd";
		String str = "s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s t t";
		String[] words = str.split(" ");
		if (pattern.length() != words.length) {
			System.out.println("false1");
		}
		HashMap<Character, Integer> map1 = new HashMap<>();
		HashMap<String, Integer> map2 = new HashMap<>();
		/*
		for (int i = 0; i < words.length; i++) {
			if (map1.put(pattern.charAt(i), i) != map2.put(words[i], i)) {
				System.out.println("false2");
				break;
			}
		}
		*/
		// ��int���Զ�װ�䣬=128��ʱ�򱨴�����Integer
		/*
		for (Integer i = 0; i < words.length; i++) {
			if (map1.put(pattern.charAt(i), i) != map2.put(words[i], i)) {
				System.out.println("false2");
				break;
			}
		}
		*/
		// ����equals
		for (int i = 0; i < words.length; i++) {
			if (map1.containsKey(pattern.charAt(i))) {
				if (!map1.put(pattern.charAt(i), i).equals(map2.put(words[i], i))) {
					System.out.println("false2");
					break;
				}
			} else {
				map1.put(pattern.charAt(i), i);
				if (map2.containsKey(words[i])) {
					System.out.println("false2");
					break;
				} else {
					map2.put(words[i], i);
				}
			}
		}
	}
}
