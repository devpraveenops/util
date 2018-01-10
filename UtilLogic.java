import java.time.Month;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class UtilLogic {
	
	/**
	 * Return month name based on number (1 to 12).
	 */
	public static void dispalyMonth() {
		int monthNumber = 1;
		String monthName = Month.of(monthNumber).name();
		System.out.println(":: Month Name :: "+monthName);
	}

	/**
	 * Return month names from JAN to DEC.
	 */
	public static void dispalyMonths() {
		System.out.println(":: Month Names :: ");
		IntStream.range(1, 13).boxed().collect(Collectors.toSet()).forEach(num ->{
			String monthNames = Month.of(num).name();
			System.out.println(monthNames);
		});
	}
	
	/**
	 * Return months from JAN to DEC & 1 to 12
	 */
	public static void dispalyMonthWith() {
		IntStream.range(1, 13).boxed().collect(Collectors.toSet()).forEach(num ->{
			String monthNames = Month.of(num).name();
			System.out.println(":: Month Number :: "+num);
			System.out.println(":: Month Name 'JULY' :: "+monthNames);
			System.out.println(":: Month Name 'July' :: "+monthNames.substring(0, 1).toUpperCase()+ monthNames.substring(1).toLowerCase());
		});
	}
}
