
public class Problem492 {
	public static void main(String[] args) {
		int area = 12;
		int[] sides = new int[2];
		int min = area;
		for (int i = 1; i <= Math.sqrt(area); i++) {
			if (area % i == 0) {
				if (Math.abs(i - area / i) < min) {
					min = Math.abs(i - area / i);
					if (i > area / i) {
						sides[0] = i;
						sides[1] = area / i;
					} else {
						sides[0] = area / i;
						sides[1] = i;
					}
				}
			}
		}
		System.out.println(sides[0] + "," + sides[1]);
	}
}
