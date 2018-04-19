package ocaJavaSE8.p4.dateAndCalendar;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

	//LocalDate is immutable. Calling any method on its instance won’t modify its value!

public class LocalDateExample {

	public static void main(String[] args) {
		LocalDate date1 = LocalDate.of(2015, 12, 27);
		LocalDate date2 = LocalDate.of(2015, Month.DECEMBER, 27);


		LocalDate date = LocalDate.parse("2020-08-30");
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getDayOfWeek());
		System.out.println(date.getDayOfYear());
		System.out.println(date.getMonth());
		System.out.println(date.getMonthValue());
		System.out.println(date.getYear());

		System.out.println();
		checkDateBeforeAfter();
		System.out.println();
		manipulateLocalDate();
		System.out.println();
		converLocalDate();
		System.out.println();
		usingEpochDay();
		System.out.println();
	}

	public static void checkDateBeforeAfter() {
		LocalDate shreyaBday = LocalDate.parse("2002-08-30");
		LocalDate paulBday = LocalDate.parse("2002-07-29");
		System.out.println(shreyaBday.isAfter(paulBday));
		System.out.println(shreyaBday.isBefore(paulBday));
	}

	public static void manipulateLocalDate() {
		LocalDate bday = LocalDate.of(2052,03,10);
		System.out.println(bday.minusDays(10));
		System.out.println(bday.minusMonths(2));
		System.out.println(bday.minusWeeks(30));
		System.out.println(bday.minusYears(1));
		LocalDate launchCompany = LocalDate.of(2016,02,29);
		System.out.println(launchCompany.plusDays(1));
		System.out.println(launchCompany.plusMonths(1));
		System.out.println(launchCompany.plusWeeks(7));
		System.out.println(launchCompany.plusYears(1));

		/* withXX() methods return a copy of the date instance replacing the specified day,
		month, or year in it:	*/
		LocalDate firstSex = LocalDate.of(2036,02,28);
		System.out.println(firstSex.withDayOfMonth(1));
		System.out.println(firstSex.withDayOfYear(1));
		System.out.println(firstSex.withMonth(7));
		System.out.println(firstSex.withYear(1));
	}

	public static void converLocalDate() {
		/*
		The LocalDate class defines methods to convert it to LocalDateTime and long
		(representing the epoch date).
		The LocalDate class defines overloaded atTime() instance methods. These methods
		combine LocalDate with time to create and return LocalDateTime, which stores
		both the date and time
		 */
		LocalDate interviewDate = LocalDate.of(2016,02,28);
		System.out.println(interviewDate.atTime(16, 30));
		System.out.println(interviewDate.atTime(16, 30, 20));
		System.out.println(interviewDate.atTime(16, 30, 20, 300));
		System.out.println(interviewDate.atTime(LocalTime.of(16, 30)));
	}

	public static void usingEpochDay() {
		/*
		You can use the method toEpochDay() to convert LocalDate to the epoch date—the
		count of days from January 1, 1970:
		*/
		LocalDate launchBook = LocalDate.of(2016,2,8);
		LocalDate aDate = LocalDate.of(1970,1,8);
		System.out.println(launchBook.toEpochDay());
		System.out.println(aDate.toEpochDay());
	}

	public static void manipulateUsingPeriod() {
		LocalDate date = LocalDate.of(2052, 01, 31);
		System.out.println(date.plus(Period.ofDays(7)));
	}
}
