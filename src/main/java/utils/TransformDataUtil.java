package utils;

import org.assertj.core.api.Assertions;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;
public class TransformDataUtil {
	private TransformDataUtil() {
		throw new IllegalStateException("Utility class");
	}

	public static long convertMinutesToMilliseconds(int minutes) {
		return minutes * 60000;
	}

	public static LocalDateTime parseDateTime(String dateTimeAsText, DateTimeFormatter formatter) {
		return LocalDateTime.parse(dateTimeAsText, formatter);
	}

	public static String parseDateTime(LocalDateTime localDateTime) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yy HH:mm:ss.SSS");
		return localDateTime.format(formatter);
	}

	public static List<LocalDateTime> parseDateTimeList(List<String> dateTimeListAsText, DateTimeFormatter formatter) {
		return dateTimeListAsText.stream().map(rowDate -> rowDate.substring(0, rowDate.indexOf("."))).map(
				date -> LocalDateTime.parse(date, formatter)).collect(Collectors.toList());
	}

	public static boolean validateDateFormat(String dateFormat, String inputDate) {
		if (inputDate == null) {
			return false;
		}
		SimpleDateFormat format = new SimpleDateFormat(dateFormat);
		try {
			format.parse(inputDate);
			return true;
		} catch (ParseException e) {
			return false;
		}
	}

	public static String capitalizeFirstLetter(String input) {
		return Arrays.stream(input.split(" ")).map(
				x -> x.replaceFirst("^[a-z]", x.substring(0, 1).toUpperCase())).collect(Collectors.toList()).stream().reduce("",
				(firstElement, secondElement) -> firstElement + " " + secondElement).trim();
	}

	public static String sortStringBasedOnFirstCharacterSeparatedByComma(String str) {
		String[] strArray = str.replaceAll("\\s", "").split(",");
		Arrays.sort(strArray, Comparator.comparingInt(str2 -> str2.charAt(0)));
		return String.join(",", strArray);
	}

	public static String getDateInFormat(String dateFormat) {
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		Date today = new Date();
		return sdf.format(today);
	}

	public static String getDateInFormat(String dateFormat,
										 int yearOffset,int monthOffset,int dateOffset,int dayOffset) {
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		Date today = new Date();

		Calendar cal = Calendar.getInstance();
		cal.setTime(today);

		cal.add(Calendar.YEAR, yearOffset);
		cal.add(Calendar.MONTH, monthOffset);
		cal.add(Calendar.DATE, dateOffset);
		cal.add(Calendar.DAY_OF_MONTH, dayOffset);

		Date modifiedDate = cal.getTime();

		return sdf.format(modifiedDate);
	}

	public static void assertNewTimeStampGreaterThanOldTimeStamp(String oldTimeStamp, String newTimestamp) {
		Assertions.assertThat(Timestamp.valueOf(newTimestamp)).isAfter(Timestamp.valueOf(oldTimeStamp));
	}
}
