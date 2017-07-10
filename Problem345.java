import java.util.ArrayList;
import java.util.HashSet;

public class Problem345 {
	public static void main(String[] args) {
		String s = "leetcode";
		HashSet<Character> hashSet = new HashSet<>();
		hashSet.add('a');
		hashSet.add('e');
		hashSet.add('i');
		hashSet.add('o');
		hashSet.add('u');
		hashSet.add('A');
		hashSet.add('E');
		hashSet.add('I');
		hashSet.add('O');
		hashSet.add('U');
		ArrayList<Character> array = new ArrayList<>();
		char[] chars = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			if (hashSet.contains(s.charAt(i))) {
				array.add(s.charAt(i));
			}
		}
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (hashSet.contains(s.charAt(i))) {
				chars[i] = array.get(array.size() - 1 - count);
				count++;
			} else {
				chars[i] = s.charAt(i);
			}
		}
		System.out.println(new String(chars));
	}
}
