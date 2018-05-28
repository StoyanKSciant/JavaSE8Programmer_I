package ocaJavaSE8.p8.javaDate;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatParsedToLocalDate {
	public static void main(String[] args) {
		// NOTE: format must respond to the appropriate class LocalDate -> ISO_DATE (not ISO_DATE_TIME)
		try {
			System.out.println(LocalDate.of(2015, Month.JANUARY, 31).format(DateTimeFormatter.ISO_DATE_TIME));
		} catch (Exception ex) {
		} finally{
			System.out.println(LocalDate.of(2015, Month.JANUARY, 31).format(DateTimeFormatter.ISO_DATE));
		}
	}
}
