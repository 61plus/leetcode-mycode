import java.util.HashMap;

public class Problem447 {
	
	public static int distance(int[] x, int[] y) {
		int dis = 0;
		dis = (x[0] - y[0]) * (x[0] - y[0]) + (x[1] - y[1]) * (x[1] - y[1]);
		return dis;
	}
	
	public static void main(String[] args) {
		int[][] points = {{0, 0}, {1, 0}, {2, 0}};
		int count = 0;
		for (int i = 0; i < points.length; i++) {
			HashMap<Integer, Integer> hashMap = new HashMap<>();
			for (int j = 0; j < points.length; j++) {
				if (j == i) {
					continue;
				}
				int dis = distance(points[i], points[j]);
				if (hashMap.containsKey(dis)) {
					hashMap.put(dis, hashMap.get(dis) + 1);
				} else {
					hashMap.put(dis, 1);
				} 
			}
			for (int value : hashMap.values()) {
				count += value * (value - 1);
			}
		}
		System.out.println(count);
	}
}
