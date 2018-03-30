package ocaJavaSE8.p4.dateAndCalendar;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalTimeExample {

	// LocalTime is immutable. Calling any method on its instance won’t
	// modify its value!

	public static void main(String[] args) {

		LocalTime timeHrsMin = LocalTime.of(12, 12); // min and sec
		LocalTime timeHrsMinSec = LocalTime.of(0, 12, 6); // hours, min and sec
		LocalTime timeHrsMinSecNano = LocalTime.of(14, 7, 10, 998654578); // hours, min, sec and nanosec

		// throwRuntimeException();
		// throwCompilatioError();

		parseString();
		queryLocalTime();
		checkBeforeAndAfter();
		changeLocalTime();

	}

	/*
	 * LocalTime doesn’t define a method to pass a.m. or p.m. Use values 0–23 to
	 * define hours. If you pass out-of-range values to either hours, minutes, or
	 * seconds, you’ll get a runtime exception.
	 */
	public static void throwRuntimeException() {
		LocalTime timeHrsMin = LocalTime.of(120, 12);
	}

	/*
	 * You’ll get a compiler error if the range of values passed to a method doesn’t
	 * comply with the method’s argument type.
	 */
	public static void throwCompilatioError() {
		LocalTime timeHrsMin2 = LocalTime.of(9986545781, 12);
	}

	/*
	 * You can parse a string to instantiate LocalTime by using its static method
	 * parse(). You can either pass a string in the format 15:08:23
	 * (hours:minutes:seconds) or parse any text using DateTimeFormatter (covered in
	 * the next section):
	 */
	public static void parseString() {

		LocalTime time = LocalTime.parse("15:08:23");
		/*
		 * NOTE If you pass invalid string values to parse(), the code will compile but
		 * will throw a runtime exception.
		 */
		LocalTime now = LocalTime.now();

		System.out.println(time);
		System.out.println(now);
	}


	/*
	 The correct method names for querying LocalTime are getHour(), getMinute(), .
	 getSecond(), and getNano().

	 Unlike the getXXX() methods, minusXXX() methods use the plural form:
	 getHour() versus minusHours(), getMinute() versus minusMinutes(), getSecond()
	 versus minusSeconds(), and getNano() versus minusNanos().
	 */
	public static void queryLocalTime() {

		LocalTime time = LocalTime.of(16, 20, 12, 98547);
		System.out.println(time.getHour());
		System.out.println(time.getMinute());
		System.out.println(time.getSecond());
		System.out.println(time.getNano());
	}

	/*
	You can use the instance methods isAfter() and isBefore() to check whether a
	time is after or before the specified time.
	 */
	public static void checkBeforeAndAfter() {

		LocalTime shreyaFinishTime = LocalTime.parse("17:09:04");
		LocalTime paulFinishTime = LocalTime.parse("17:09:12");
		if(shreyaFinishTime.isBefore(paulFinishTime)) {
			System.out.println("Shreya wins");
		} else {
			System.out.println("Paul wins");
		}
	}

	public static void changeLocalTime() {
		LocalTime movieStartTime = LocalTime.parse("21:00:00");
		int commuteMin = 35;
		LocalTime shreyaStartTime = movieStartTime.minusMinutes(commuteMin);
		System.out.println("Start by " + shreyaStartTime + " from office");
	}

	/*
	The LocalTime class defines the atDate() method to combine a LocalDate with
	itself to create LocalDateTime:
	*/
	public static void combineWithLocalDate() {

		LocalTime time = LocalTime.of(14, 10, 0);
		LocalDate date = LocalDate.of(2016,02,28);
		LocalDateTime dateTime = time.atDate(date);
		System.out.println(dateTime);
	}
}
