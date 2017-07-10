import java.util.ArrayList;
import java.util.List;

public class Problem438 {
	public static void main(String[] args) {
		String s = "cbaebabacd";
		String p = "abc";
		//String s = "abab";
		//String p = "ab";
		List<Integer> list = new ArrayList<>();
		if (s == null || p == null || p.length() > s.length()) {
			System.out.println(list);
		}
		int[] chars = new int[26];
		for (int i = 0; i < p.length(); i++) {
			chars[p.charAt(i) - 'a']++;
		}
		int start = 0;
		int end = 0;
		int count = p.length();
		while (end < s.length()) {
			if (end - start == p.length() && chars[s.charAt(start++) - 'a']++ >= 0) {
				count++;
			}
			if (--chars[s.charAt(end++) - 'a'] >= 0) {
				count--;
			}
			if (count == 0) {
				list.add(start);
			}
		}
		System.out.println(list);
	}
}
