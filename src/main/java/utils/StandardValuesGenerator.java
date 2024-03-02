package utils;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


public class StandardValuesGenerator {
	public static String generateIdStartsFrom(String startString, int charactersCount) {
		if (charactersCount <= startString.length()) {
			return startString;
		}
		return startString + RandomStringUtils.random(charactersCount - startString.length() - 1, true, false).concat(
				RandomStringUtils.random(1, false, true)).toLowerCase();
	}

	public static String generateIntValueText(int charactersCount) {
		return Integer.valueOf(RandomStringUtils.random(charactersCount, false, true)).toString();
	}

	public static String generateLongValueText(int charactersCount) {
		return Long.valueOf(RandomStringUtils.random(charactersCount, false, true)).toString();
	}

	public static String generateStringValueText(int charactersCount) {
		return RandomStringUtils.random(charactersCount, true, false);
	}

	public static String generateNewEmailAddress(String domain) {
		return generateStringValueText(5).toLowerCase() + (new Date()).getTime() + "@" + domain + ".com";
	}

	public static String generateNewEmailAddressContainingText(String textToInclude, String domain) {
		return textToInclude.toLowerCase() + (new Date()).getTime() + "@" + domain + ".com";
	}

	public static String generateNewMckessonEmailAddress() {
		return generateStringValueText(5) + (new Date()).getTime() + "@mckesson.com";
	}

	public static void getCombinations(List<List<String>> lists, int row, String[] comb, List<List<String>> result) {
		if (row == lists.size()) {
			List<String> tempResult = new ArrayList<>(Arrays.asList(comb));
			result.add(tempResult);
			return;
		}
		for (int i = 0; i < lists.get(row).size(); i++) {
			comb[row] = lists.get(row).get(i);
			getCombinations(lists, row + 1, comb, result);
		}
	}

}