import java.util.Arrays;

public class Problem475 {
	public static void main(String[] args) {
		int[] houses = {1,2,3,4};
		int[] heaters = {1,2,3,4};
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int res = 0;
        for (int i = 0; i < houses.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < heaters.length; j++) {
                if (Math.abs(heaters[j] - houses[i]) <= min)
                    min = Math.abs(heaters[j] - houses[i]);
                else
                    break;
            }
            res = Math.max(res, min);
        }
        System.out.println(res);
	}
}
