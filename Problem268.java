import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Problem268 {
	public static void main(String[] args) {
		int[] nums = {1, 0};
		int ans = -1;
		int len = nums.length;
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < len; i++) {
			set.add(nums[i]);
		}
		ArrayList<Integer> array = new ArrayList<>();
		Iterator<Integer> iter = set.iterator();
		while (iter.hasNext()) {
			array.add(iter.next());
		}
        if (array.get(0) != 0) {
			ans = 0;
		}
		if (array.get(len - 1) != len) {
		    ans = len;
		}
		for (int i = 1; i < len; i++) {
			if (array.get(i) - array.get(i - 1) != 1) {
				ans = array.get(i) - 1;
			}
		}
		System.out.println(ans);
	}
}
