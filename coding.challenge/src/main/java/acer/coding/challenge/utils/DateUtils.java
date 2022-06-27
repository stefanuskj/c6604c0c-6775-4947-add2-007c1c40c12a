/**
 * 
 */
package acer.coding.challenge.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author stefanuskj
 *
 */
public class DateUtils {
	public static String getDayNumberSuffix(int day) {
		if (day >= 11 && day <= 13) {
			return "th";
		}
		switch (day % 10) {
		case 1:
		    return "st";
		case 2:
		    return "nd";
		case 3:
		    return "rd";
		default:
		    return "th";
		}
	}
	
	public static Calendar stringDateToCalendar(String stringDate) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		Date date = format.parse(stringDate);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar;		
	}
	
	public static String intMonthToString(int month) {
		switch (month) {
		case 0:
			return "January";
		case 1:
			return "February";
		case 2:
			return "March";
		case 3:
			return "April";
		case 4:
			return "May";
		case 5:
			return "June";
		case 6:
			return "July";
		case 7:
			return "August";
		case 8:
			return "September";
		case 9:
			return "October";
		case 10:
			return "November";
		case 11:
			return "December";
		default:
			return "";
		}
	}
	
	public static String intToAmPm(int ampm) {
		return ampm > 0 ? "PM" : "AM";
	}
	
	public static boolean dateComparator (String currentDate, String previousDate) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat ("dd/MM/yyyy hh:mm:ss");
		Date current = dateFormat.parse(currentDate);
		Date previous = dateFormat.parse(previousDate);
		if (current.compareTo(previous) > 0) {
			return true;
		}
		else if (current.compareTo(previous) < 0) {
			return false;
		}
		return true;
	}
}
