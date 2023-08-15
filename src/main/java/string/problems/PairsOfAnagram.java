package string.problems;
import java.util.Arrays;

public class PairsOfAnagram {

	public static void main(String[] args) {

		String s1[] = { "cars", "dues", "scar", "used", "paired", "ones", "grab", "brag" };

		// cars-->scar
		// dues-->used
		// grab-->brag

		for (int i = 0; i < s1.length; i++) {

			for (int j = i + 1; j < s1.length; j++) {

				char[] arr1 = s1[i].toCharArray();
				char[] arr2 = s1[j].toCharArray();
				Arrays.sort(arr1);
				Arrays.sort(arr2);

				if (Arrays.equals(arr1, arr2)) {
					System.out.println((s1[i] + "-->" + s1[j]));
				}
			}
		}
	}
}

