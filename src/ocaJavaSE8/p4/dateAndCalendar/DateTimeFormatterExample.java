package ocaJavaSE8.p4.dateAndCalendar;

import java.nio.charset.MalformedInputException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

// A DateTimeFormatter can define rules to format or parse a date object, time object, or both.
public class DateTimeFormatterExample {

	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		LocalTime time = LocalTime.now();
		System.out.println(formatter.format(time));
	}

	// You can instantiate or access a DateTimeFormatter object in multiple ways:

	public static void initialializeDTFormatter() {
		// By calling a static ofXXX method, passing it a FormatStyle value
		// By access public static fields of DateTimeFormatter
		// By using the static method ofPattern and passing it a string value

	}

}
