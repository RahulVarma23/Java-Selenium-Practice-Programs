package interview2.questions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CovertStringToDate {

	public static void main(String[] args) throws ParseException {
		String s ="15012021";	
		StringBuilder sb = new StringBuilder();
		
		sb.append(s.substring(0, 2)).append("-").append(s.substring(2,4)).append("-").append(s.substring(4));		
		Date givenFormat = new SimpleDateFormat("dd-MM-yyyy").parse(sb.toString());	
		String StringDate = new SimpleDateFormat("dd MMM yyyy").format(givenFormat);	
		System.out.println("Formated date: "+StringDate);
	}
}
