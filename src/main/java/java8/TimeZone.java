package java8;

import java.time.*;


public class TimeZone {

	public static void main(String[] args) {

		//print zone
		ZoneId zoneId = ZoneId.systemDefault();
		System.out.println(zoneId);

		//print local date
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate.getDayOfMonth());
		System.out.println(localDate.getMonthValue());

		//local time
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime.getHour());
		System.out.println(localTime.getSecond());

	}
}
