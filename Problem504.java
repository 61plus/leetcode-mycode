import java.util.ArrayList;

public class Problem504 {
	public static void main(String[] args) {
		int num = 100;
		String result = "";
		boolean positive = true;
		if (num == 0) {
			System.out.println("0");
		}
		if (num < 0) {
			positive = false;
			num = -num;
		}
		ArrayList<Integer> array = new ArrayList<>();
		while (num != 0) {
			array.add(num % 7);
			num = num / 7;
		}
		for (int i = array.size() - 1; i >= 0; i--) {
			result += array.get(i);
		}
		if (positive) {
			System.out.println(result);
		} else {
			System.out.println("-" + result);
		}
	}
}
