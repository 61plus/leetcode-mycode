import java.util.ArrayList;
import java.util.HashMap;

public class Problem599 {
	public static void main(String[] args) {
		String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
		String[] list2 = {"KFC", "Shogun", "Burger King"};
		HashMap<String, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < list1.length; i++) {
			hashMap.put(list1[i], i);
		}
		int min = list1.length + list2.length - 2;
		ArrayList<String> array = new ArrayList<>();
		for (int i = 0; i < list2.length; i++) {
			if (hashMap.containsKey(list2[i]) && hashMap.get(list2[i]) + i < min) {
				min = hashMap.get(list2[i]) + i;
			}
		}
		for (int i = 0; i < list2.length; i++) {
			if (hashMap.containsKey(list2[i]) && hashMap.get(list2[i]) + i == min) {
				array.add(list2[i]);
			}
		}
		String[] result = new String[array.size()];
		for (int i = 0; i < array.size(); i++) {
			result[i] = array.get(i);
		}
		System.out.println(array);
	}
}
