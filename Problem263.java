
public class Problem263 {
	public static void main(String[] args) {
		int num = 1;
		int[] prime = {2, 3, 5};
		for (int i = 0; i < 3; i++) {
			while (num % prime[i] == 0) {
				num /= prime[i];
			}
		}
		if (num == 1) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
