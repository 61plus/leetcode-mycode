
public class Problem520 {
	public static void main(String[] args) {
		String word = "FlaG";
		if (word.length() == 1) {
			System.out.println("true");
		} else {
			if (word.charAt(0) <= 90) {
				if (word.length() == 2) {
					System.out.println("true");
				} else {
					if (word.charAt(1) <= 90) {
						for (int i = 2; i < word.length(); i++) {
							if (word.charAt(i) > 90) {
								System.out.println("false");
							}
						}
					} else {
						for (int i = 2; i < word.length(); i++) {
							if (word.charAt(i) <= 90) {
								System.out.println("false");
							}
						}
					}
				}
			} else {
				for (int i = 1; i < word.length(); i++) {
					if (word.charAt(i) <= 90) {
						System.out.println("false");
					}
				}
			}
		}
		System.out.println("true");
	}
}
