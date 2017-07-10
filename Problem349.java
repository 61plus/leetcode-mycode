import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Problem349 {
	public static void main(String[] args) {
		int[] nums1 = {1, 2, 2, 1};
		int[] nums2 = {2, 2};
		HashSet<Integer> set1 = new HashSet<>();
		HashSet<Integer> set2 = new HashSet<>();
		for (int i = 0; i < nums1.length; i++) {
			set1.add(nums1[i]);
		}
		for (int i = 0; i < nums2.length; i++) {
			set2.add(nums2[i]);
		}
		ArrayList<Integer> array = new ArrayList<>();
		Iterator<Integer> iter1 = set1.iterator();
		while(iter1.hasNext()) {
			int tmp = iter1.next();
			Iterator<Integer> iter2 = set2.iterator();
			while(iter2.hasNext()) {
				if(iter2.next() == tmp) {
					array.add(tmp);
				}
			}
		}
		System.out.println(array);
		int[] result = new int[array.size()];
		for (int i = 0; i < array.size(); i++) {
		    result[i] = array.get(i);
		}
	}
}
