package constractor;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class DateCalc {

	private LocalDateTime dateTime;

	public DateCalc() {

		dateTime = LocalDateTime.now();
	}

	public DateCalc(int num) {

		this();
		dateTime = dateTime.plusDays(num);
	}

	public DateCalc(String str) {
		this();
		List<String> list = Arrays.asList("one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
				"ten");

		int index = list.indexOf(str);
		if (index > -1) {
			dateTime = dateTime.plusDays(index + 1);
		}
	}

	public void printDate() {

		System.out.println(dateTime);
	}
}
