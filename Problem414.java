import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Problem414 {
	public static void main(String[] args) {
		int[] nums = { 2, 2, 3, 1 };
		Set<Integer> treeSet = new TreeSet<>();
		for (int i = 0; i < nums.length; i++) {
			treeSet.add(nums[i]);
		}
		int len = treeSet.size();
		int[] tmp = new int[len];
		int count = 0;
		Iterator<Integer> it = treeSet.iterator();
		while (it.hasNext()) {
			int num = it.next();
			tmp[len - 1 - count] = num;
			count++;
		}
		if (len < 3) {
			System.out.println(tmp[0]);
		} else {
			System.out.println(tmp[2]);
		}
	}
}
