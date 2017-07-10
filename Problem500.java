import java.util.ArrayList;
import java.util.TreeSet;

public class Problem500 {
	public static void main(String[] args) {
		char[] line1 = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p' };
		char[] line2 = { 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l' };
		char[] line3 = { 'z', 'x', 'c', 'v', 'b', 'n', 'm' };
		TreeSet<Character> treeset1 = new TreeSet<>();
		TreeSet<Character> treeset2 = new TreeSet<>();
		TreeSet<Character> treeset3 = new TreeSet<>();
		for (int i = 0; i < line1.length; i++) {
			treeset1.add(line1[i]);
		}
		for (int i = 0; i < line2.length; i++) {
			treeset2.add(line2[i]);
		}
		for (int i = 0; i < line3.length; i++) {
			treeset3.add(line3[i]);
		}
		String[] words = { "Hello", "Alaska", "Dad", "Peace" };
		ArrayList<String> output = new ArrayList<>();
		for (int i = 0; i < words.length; i++) {
			String tmp = words[i].toLowerCase();
			int line = 0;
			if (treeset1.contains(tmp.charAt(0))) {
				line = 1;
			} else if (treeset2.contains(tmp.charAt(0))) {
				line = 2;
			} else if (treeset3.contains(tmp.charAt(0))) {
				line = 3;
			}
			int count = 0;
			for (int j = 0; j < tmp.length(); j++) {
				if (treeset1.contains(tmp.charAt(j))) {
					count += 1;
				} else if (treeset2.contains(tmp.charAt(j))) {
					count += 2;
				} else if (treeset3.contains(tmp.charAt(j))) {
					count += 3;
				}
			}
			if (count == line * tmp.length()) {
				output.add(words[i]);
			}
		}
		String[] result = new String[output.size()];
		for (int i = 0; i < result.length; i++) {
			result[i] = output.get(i);
			System.out.println(result[i]);
		}
	}
}
