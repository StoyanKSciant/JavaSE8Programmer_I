package ocaJavaSE8.p4.dateAndCalendar;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatParsedToLocalDate {
	public static void main(String[] args) {
		System.out.println(LocalDate.of(2015, Month.JANUARY, 31).format(DateTimeFormatter.ISO_DATE_TIME));
	}
}
