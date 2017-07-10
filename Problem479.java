
public class Problem479 {
	public static void main(String[] args) {
		long num = 123;
		StringBuilder sb = new StringBuilder();
		sb.append(num);
		String str = num + sb.reverse().toString();
		System.out.println(Long.valueOf(str));
	}
}
