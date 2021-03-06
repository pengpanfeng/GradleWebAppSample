package com.mindstorm.apputils;

import org.joda.time.Days;
import org.joda.time.LocalDate;

public class DateUtils {

	public int daysToNewYear() {
	      LocalDate fromDate = new LocalDate();
		  LocalDate newYear = fromDate.plusYears(1).withDayOfYear(1);
		  return Days.daysBetween(fromDate, newYear).getDays();
	}
	
	public int daysToNewYear4() {
	      LocalDate fromDate = new LocalDate();
		  LocalDate newYear = fromDate.plusYears(1).withDayOfYear(1);
		  return Days.daysBetween(fromDate, newYear).getDays();
	}
	

}
