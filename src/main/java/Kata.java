public class Kata {
	public static String replaceNth(String text, int n, char oldValue, char newValue) {
		String text2 = "";
		char[] array1 = text.toCharArray();

		for (int i = 0; i < text.length(); i++) {
			if (array1[i] == oldValue && i == n) {

				array1[i] = newValue;
				text2 = text.substring(0) + array1[i] + text.substring(i + 1);

			}
		}

		return text2;

	}

	public static void main(String[] args) {

		

	}

}
