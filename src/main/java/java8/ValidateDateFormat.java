package java8;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ValidateDateFormat {

	public static void main(String[] args) {
		System.out.println(validateDateFormat("2018-01-31 8:40:03"));
	}
	
	public static  boolean validateDateFormat(String input) {
		    if(input == null) {
		        return false;
		    }
		    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		    try {
		        format.parse(input);
		        return true;
		    } catch(ParseException e) {
		        return false;
		    }
	}
}
