package Grooming;

public class AlternateCaseConverter {
	public static String convertAlternateCase(String str) {
		if (str == null || str.isEmpty()) {
			return "";
		}

		StringBuilder result = new StringBuilder();
		boolean toUpperCase = true;

		for (char c : str.toCharArray()) {
			if (Character.isLetter(c)) {
				if (toUpperCase) {
					result.append(Character.toUpperCase(c));
				} else {
					result.append(Character.toLowerCase(c));
				}
				toUpperCase = !toUpperCase;
				result.append(c);
			}
		}
		return result.toString();
	}

	public static void main(String[] args) {
		String input = "hello world!";
		String result = convertAlternateCase(input);
		System.out.println("Sample Input: \"" + input + "\"");
		System.out.println("Sample Output: \"" + result + "\""); 
	}
}
