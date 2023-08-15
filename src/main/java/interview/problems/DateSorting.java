package interview.problems;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class DateSorting {

	public static void main(String[] args) throws ParseException {	
		String input [] = {"11/23","10/17","11/21","01/19"};
		
		DateFormat dateFormat= new SimpleDateFormat("MM/dd");
		ArrayList <Date> listDates = new ArrayList <Date>();
		
		for(String currentDate:input) {
			listDates.add(dateFormat.parse(currentDate));
		}
		Collections.sort(listDates);
	}
}


