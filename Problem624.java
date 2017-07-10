import java.util.ArrayList;
import java.util.List;

public class Problem624 {
	public static void main(String[] args) {
		List<Integer> array1 = new ArrayList<>();
		array1.add(1);
		array1.add(2);
		array1.add(3);
		List<Integer> array2 = new ArrayList<>();
		array2.add(4);
		array2.add(5);
		List<Integer> array3 = new ArrayList<>();
		array3.add(1);
		array3.add(2);
		array3.add(3);
		List<List<Integer>> arrays = new ArrayList<>();
		arrays.add(array1);
		arrays.add(array2);
		arrays.add(array3);
		System.out.println(arrays);
		int[][] extremum = new int[arrays.size()][2];
		for (int i = 0; i < arrays.size(); i++) {
			extremum[i][0] = arrays.get(i).get(0);
			extremum[i][1] = arrays.get(i).get(arrays.get(i).size() - 1);
		}
		int res = Integer.MIN_VALUE;
		int max = extremum[0][1];
		int min = extremum[0][0];
		for (int i = 1; i < extremum.length; i++) {
			res = Math.max(res, extremum[i][1] - min);
			res = Math.max(res, max - extremum[i][0]);
			max = Math.max(max, extremum[i][1]);
			min = Math.min(min, extremum[i][0]);
		}
		System.out.println(res);
	}
}
