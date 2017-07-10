import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Problem347 {
	public static void main(String[] args) {
		int[] nums = {4,4,4,1,1,1,2,2,3};
		int k = 2;
		Map<Integer, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (hashMap.containsKey(nums[i])) {
				hashMap.put(nums[i], hashMap.get(nums[i]) + 1);
			} else {
				hashMap.put(nums[i], 1);
			}
		}
		Map<Integer, String> treeMap = new TreeMap<>();
		for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
			int key = entry.getKey();
			int val = entry.getValue();
			if (treeMap.containsKey(val)) {
				treeMap.put(val, treeMap.get(val) + "," + key);
			} else {
				treeMap.put(val, "" + key);
			}
		}
		List<Integer> array = new ArrayList<>();
		for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
			String val = entry.getValue();
			String[] strs = val.split(",");
			for (int i = 0; i < strs.length; i++) {
				array.add(Integer.valueOf(strs[i]));
			}
		}
		System.out.println(array.subList(array.size() - k, array.size()));
	}
}
