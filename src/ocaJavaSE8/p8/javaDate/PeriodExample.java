package ocaJavaSE8.p8.javaDate;

import java.time.LocalDate;
import java.time.Period;

/*
With the Java 8 Date API,
you can use the Period class to do so. The Period class represents a date-based
amount in years, months, and days, like 2 years, 5 months, and 10 days. To work with a
time-based amount in seconds and nanoseconds, you can use the Duration class.

NOTE: The Duration class can be used to store amounts of time like 1 hour,
36 minutes, or 29.4 seconds. But this class isn’t explicitly covered in this exam
(and this book). It’s covered in the OCP Java SE 8 Programmer II exam.
 */
public class PeriodExample {

	public static void main(String[] args) {

		initializePeriod();
		parseStringToPeriod();
		instantiatePerionWithBetween();
		queryPeriodInstances();
		manipulatePeriod();
		substractPeriod();
		additionPeriod();
		convertToNumber();
	}

	/*
	A period of 35 days is not stored as 1 month and 5 days. Its individual
	elements, that is, days, months, and years, are stored the way it is
	initialized.
	 */
	public static void initializePeriod() {
		Period period1 = Period.of(1, 2, 7);
		Period period2 = Period.ofYears(2);
		Period period3 = Period.ofMonths(5);
		Period period4 = Period.ofWeeks(10);
		Period period5 = Period.ofDays(15);
	}

	/*
	 You can define positive or negative periods of time. For example, you can
	 define Period instances representing 15 or -15 days.
	 */
	public static void parseStringToPeriod() {


		Period p5Yrs1 = Period.parse("P5y");
		Period p5Yrs2 = Period.parse("p5y");
		Period p5Yrs3 = Period.parse("P5Y");
		Period p5Yrs4 = Period.parse("+P5Y");
		Period p5Yrs5 = Period.parse("P+5Y");
		Period p5Yrs6 = Period.parse("-P-5Y");
		System.out.println(p5Yrs1 + ":" + p5Yrs2);
	}

	/*
	 * If you pass invalid string values to parse(), the code will compile but will
	 * throw a runtime exception.
	 */
	public static void instantiatePerionWithBetween() {
		LocalDate carnivalStart = LocalDate.of(2050, 12, 31);
		LocalDate carnivalEnd = LocalDate.of(2051, 1, 2);
		Period periodBetween = Period.between(carnivalStart, carnivalEnd);
		System.out.println(periodBetween);
	}

	/*
	When you initialize a Period instance with days more than 31 or months more
	than 12, it doesn’t recalculate its years, months, or days components.
	 */
	public static void queryPeriodInstances() {
		Period period = Period.of(2, 4, 40);
		System.out.println(period.getYears());
		System.out.println(period.getMonths());
		System.out.println(period.getDays());
	}

	/*
	In the class Period, both the getXXX() methods and minusXXX()
	methods use the plural form: getYears(), minusHours().
	 */
	public static void manipulatePeriod() {
		LocalDate bday = LocalDate.of(2020, 10, 29);
		LocalDate today = LocalDate.now();
		Period period10Days = Period.of(0, 0, 10);
		if (bday.minus(period10Days).isBefore(today)) {
			System.out.println("Time to send out reminders to friends");
		}
	}

	/*
	When you subtract Period instances using the minusXXX() methods,
	the individual elements are subtracted. Subtracting P10D from P1M
	returns P1M-10D and not P20D.
	 */
	public static void substractPeriod() {
		Period period10Days = Period.of(0, 0, 10);
		Period period1Month = Period.of(0, 1, 0);
		System.out.println(period10Days.minus(period1Month));
		System.out.println(period10Days.minusDays(5));
		System.out.println(period10Days.minusMonths(5));
		System.out.println(period10Days.minusYears(5));
	}

	/*
	Adding a Period of 10 months to a Period of 5 months gives 15
	months, not 1 year and 3 months.
	 */
	public static void additionPeriod() {
		Period period5Month = Period.of(0, 5, 0);
		Period period10Month = Period.of(0, 10, 0);
		Period period10Days = Period.of(0, 0, 10);
		System.out.println(period5Month.plus(period10Month));
		System.out.println(period10Days.plusDays(35));
		System.out.println(period10Days.plusMonths(5));
		System.out.println(period10Days.plusYears(5));
	}

	/*
	The method toTotalMonths() returns the total number of months in the period by
	multiplying the number of years by 12 and adding the number of months:
	 */

	public static void convertToNumber() {
		System.out.println(Period.of(10,5,40).toTotalMonths());
	}
}
