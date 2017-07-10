
public class Problem537 {
	public static void main(String[] args) {
		String a = "1+1i";
		String b = "1+1i";
		String[] astrs = a.split("\\+");
		int ax = Integer.valueOf(astrs[0]);
		int ay = Integer.valueOf(astrs[1].substring(0, astrs[1].length() - 1));
		String[] bstrs = b.split("\\+");
		int bx = Integer.valueOf(bstrs[0]);
		int by = Integer.valueOf(bstrs[1].substring(0, bstrs[1].length() - 1));
		String result = (ax * bx - ay * by) + "+" + (ax * by + ay * bx) + "i";
		System.out.println(result);
	}
}
