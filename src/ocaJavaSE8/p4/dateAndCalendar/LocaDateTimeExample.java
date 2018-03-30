package ocaJavaSE8.p4.dateAndCalendar;

import java.time.LocalDateTime;
import java.time.Period;

public class LocaDateTimeExample {

	/*
	 * If you want to store both date and time (without the time zone), use the
	 * class Local- DateTime. It stores a value like 2050-06-18T14:20:30:908765
	 * (year-month-dayThours :minutes:seconds:nanoseconds).
	 *
	 * The LocalDateTime class uses the letter T to separate date and time values in
	 * its printed value.
	 */

	public static void main(String[] args) {
		LocalDateTimeExampleMethods();
	}

	public static void LocalDateTimeExampleMethods() {

		LocalDateTime prizeCeremony = LocalDateTime.parse("2050-06-05T14:00:00");
		LocalDateTime dateTimeNow = LocalDateTime.now();

		if (prizeCeremony.getMonthValue() == 6) {
			System.out.println("Can't invite president");
		} else {
			System.out.println("President invited");
		}

		LocalDateTime chiefGuestDeparture = LocalDateTime.parse("2050-06-05T14:30:00");
		if (prizeCeremony.plusHours(2).isAfter(chiefGuestDeparture)) {
			System.out.println("Chief Guest will leave before ceremony completes");
		}

		LocalDateTime eventMgrArrival = LocalDateTime.of(2050, 6, 5, 14, 30, 0);
		if (eventMgrArrival.isAfter(prizeCeremony.minusHours(3))) {
			System.out.println("Manager is supposed to arrive 3 hrs earlier");
		}
	}

	public static void manipulateUsingPeriod() {
		LocalDateTime dateTime = LocalDateTime.parse("2052-01-31T14:18:36");
		System.out.println(dateTime.plus(Period.ofMonths(1)));
		System.out.println(dateTime.minus(Period.ofYears(2)));
	}

}
