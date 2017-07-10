import java.util.HashMap;

public class Problem575 {
	public static void main(String[] args) {
		int[] candies = {1,1,2,2,3,3};
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < candies.length; i++) {
			if (hashMap.containsKey(candies[i])) {
				hashMap.put(candies[i], hashMap.get(candies[i]) + 1);
			} else {
				hashMap.put(candies[i], 1);
			}
		}
		if (hashMap.size() >= candies.length / 2) {
			System.out.println(candies.length / 2);
		} else {
			System.out.println(hashMap.size());
		}
	}
}
