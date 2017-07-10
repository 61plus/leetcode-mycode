
public class Problem223 {
	public static void main(String[] args) {
		int A = -3;
		int B = 0;
		int C = 3;
		int D = 4;
		int E = 0;
		int F = -1;
		int G = 9;
		int H = 2;
		int area = 0;
		if (A >= G || C <= E || B >= H || D <= F)
			area = 0;
		else {
			int width = Math.min(C, G) - Math.max(A, E);
			int height = Math.min(D, H) - Math.max(B, F);
			area = width * height;
		}
		System.out.println(area);
	}
}
