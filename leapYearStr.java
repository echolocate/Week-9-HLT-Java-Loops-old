
public class leapYearStr {

	public static void main(String[] args) {
		int year;
		// for years between 1900 and 2030 inclusive
		for (int i = 1900; i <= 2030; i++) {
			year = i;
			// Great to know about those old ternary's now ! Where have they been all my life? A long comment goes well with a long formula. 
			String ifLeapYear = ((year % 400 == 0) || ((year % 4 == 0)) && (year % 100 != 0)) ? " is a Leap Year." : " is NOT a Leap Year.";
			System.out.println(year + ifLeapYear);
		}
	}
}


