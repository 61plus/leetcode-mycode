import java.util.HashSet;
import java.util.Set;

public class Problem260 {
	public static void main(String[] args) {
		int[] nums = {1, 2, 1, 3, 2, 5};
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i]))
                set.remove(nums[i]);
            else
                set.add(nums[i]);
        }
        int[] result = new int[2];
        result[0] = (int)set.toArray()[0];
        result[1] = (int)set.toArray()[1];
        System.out.println(result[0] + "," + result[1]);
	}
}
