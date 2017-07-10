import java.util.ArrayList;
import java.util.List;

public class Problem125 {
	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
		s = s.toLowerCase();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			int num = (int)s.charAt(i);
			if (num >= 97 && num <= 122)
				list.add(num);
			if (num >= 48 && num <= 57)
				list.add(num);
		}
		int left = 0;
		int right = list.size() - 1;
		while (left < right) {
			if (list.get(left) != list.get(right)) {
				System.out.println("false");
			}
			left++;
			right--;
		}
		System.out.println("true");
		System.out.println((int)'Z');
	}
}
