package ocaJavaSE8.p8.javaDate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

// A DateTimeFormatter can define rules to format or parse a date object, time object, or both.
public class DateTimeFormatterExample {

	public static void main(String[] args) {

		LocalDateTime time = LocalDateTime.now();

		// By calling a static ofXXX method, passing it a FormatStyle value
		DateTimeFormatter fmt1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		System.out.println(fmt1.format(time));

		// By access public static fields of DateTimeFormatter
		DateTimeFormatter fmt2 = DateTimeFormatter.ISO_DATE;
		System.out.println(fmt2.format(time));

		// By using the static method ofPattern and passing it a string value
		DateTimeFormatter fmt3= DateTimeFormatter.ofPattern("yy.M.dd");
		System.out.println(fmt3.format(time));

	}
}
