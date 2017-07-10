import java.util.Stack;

public class Problem20 {
	public static void main(String[] args) {
		String s = "()[]{}";
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(')
				stack.push(')');
			else if (c == '[')
				stack.push(']');
			else if (c == '{')
				stack.push('}');
			else if (stack.isEmpty() || c != stack.pop())
				System.out.println("false");
		}
	}
}
