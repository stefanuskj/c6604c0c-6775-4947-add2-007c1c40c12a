/**
 * 
 */
package acer.coding.challenge.utils;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

/**
 * @author stefauskj
 *
 */
public class DateUtilsTest {

	/**
	 * Test method for {@link acer.coding.challenge.utils.DateUtils#getDayNumberSuffix(int)}.
	 */
	@Test
	public void getDayNumberSuffixTest_shouldReturnTh() {
		assertEquals("th",DateUtils.getDayNumberSuffix(11));
	}
	@Test
	public void getDayNumberSuffixTest_shouldReturnSt(){
		assertEquals("st",DateUtils.getDayNumberSuffix(1));
	}
	@Test
	public void getDayNumberSuffixTest_shouldReturnNd() {
		assertEquals("nd",DateUtils.getDayNumberSuffix(2));
	}
	@Test
	public void getDayNumberSuffixTest_shouldReturnRd() {
		assertEquals("rd",DateUtils.getDayNumberSuffix(3));
	}

	/**
	 * Test method for {@link acer.coding.challenge.utils.DateUtils#stringDateToCalendar(java.lang.String)}.
	 */
	@Test
	public void stringDateToCalendarTest_shouldReturnCalendarWithSameDateAsInput() {
		String stringDate =  "16/12/2019 10:46:00";
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		Date date = null;
		try {
			date = format.parse(stringDate);
		} catch (ParseException e) {
			System.out.println(e.getMessage());
		}
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		
		try {
			assertEquals(calendar, DateUtils.stringDateToCalendar(stringDate));
		} catch (ParseException e) {
			System.out.println(e.getMessage());
		}
		
	}
	@Test
	public void stringDateToCalendarTest_shouldFailed() {
		String wrongStringDate =  "16/12/2029 10:36:00";
		String correctStringDate =  "16/12/2019 10:46:00";
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		Date date = null;
		try {
			date = format.parse(wrongStringDate);
		} catch (ParseException e) {
			System.out.println(e.getMessage());
		}
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		
		try {
			assertNotEquals(calendar, DateUtils.stringDateToCalendar(correctStringDate));
		} catch (ParseException e) {
			System.out.println(e.getMessage());
		}
		
	}

	/**
	 * Test method for {@link acer.coding.challenge.utils.DateUtils#intMonthToString(int)}.
	 */
	@Test
	public void intMonthToStringTest_shouldReturnJanuary() {
		assertEquals("January",DateUtils.intMonthToString(0));
	}
	@Test
	public void intMonthToStringTest_shouldReturnFebruary() {
		assertEquals("February",DateUtils.intMonthToString(1));
	}
	@Test
	public void intMonthToStringTest_shouldReturnMarch() {
		assertEquals("March",DateUtils.intMonthToString(2));
	}
	@Test
	public void intMonthToStringTest_shouldReturnApril() {
		assertEquals("April",DateUtils.intMonthToString(3));
	}
	@Test
	public void intMonthToStringTest_shouldReturnMay() {
		assertEquals("May",DateUtils.intMonthToString(4));
	}
	@Test
	public void intMonthToStringTest_shouldReturnJune() {
		assertEquals("June",DateUtils.intMonthToString(5));
	}
	@Test
	public void intMonthToStringTest_shouldReturnJuly() {
		assertEquals("July",DateUtils.intMonthToString(6));
	}
	@Test
	public void intMonthToStringTest_shouldReturnAugust() {
		assertEquals("August",DateUtils.intMonthToString(7));
	}
	@Test
	public void intMonthToStringTest_shouldReturnSeptember() {
		assertEquals("September",DateUtils.intMonthToString(8));
	}
	@Test
	public void intMonthToStringTest_shouldReturnOctober() {
		assertEquals("October",DateUtils.intMonthToString(9));
	}
	@Test
	public void intMonthToStringTest_shouldReturnNovember() {
		assertEquals("November",DateUtils.intMonthToString(10));
	}
	@Test
	public void intMonthToStringTest_shouldReturnDecember() {
		assertEquals("December",DateUtils.intMonthToString(11));
	}

	/**
	 * Test method for {@link acer.coding.challenge.utils.DateUtils#intToAmPm(int)}.
	 */
	@Test
	public void intToAmPmTest_shouldReturnAm() {
		assertEquals("AM",DateUtils.intToAmPm(0));
	}
	@Test
	public void intToAmPmTest_shouldReturnPm() {
		assertEquals("PM",DateUtils.intToAmPm(1));
	}

	/**
	 * Test method for {@link acer.coding.challenge.utils.DateUtils#dateComparator(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void dateComparatorTest_shouldReturnTrue() {
		try {
			assertTrue(DateUtils.dateComparator("16/12/2019 10:46:00","16/12/2019 10:00:00"));
		} catch (ParseException e) {
			System.out.println(e.getMessage());
		}
	}
	@Test
	public void dateComparatorTest_shouldReturnFalse() {
		try {
			assertFalse(DateUtils.dateComparator("16/12/2019 10:00:00","16/12/2019 10:46:00"));
		} catch (ParseException e) {
			System.out.println(e.getMessage());
		}
	}

}
