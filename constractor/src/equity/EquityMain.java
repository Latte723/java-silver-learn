package equity;

import java.time.LocalDate;

public class EquityMain {

	public static void main(String[] args) {
		EquityPerson hanako = new EquityPerson("hanako", LocalDate.parse("1998-08-08"), 162, 52.0);
		EquityPerson hanakosan = new EquityPerson("hanako", LocalDate.parse("1998-08-08"), 162, 52.0);
		EquityPerson hanakoclone = hanako;

		checkEquity(hanako, hanakosan);
		checkEquity(hanako, hanakoclone);
	}

	private static void checkEquity(EquityPerson person1, EquityPerson person2) {

		if (person1 == person2) {
			System.out.println("同じ人");
		} else if (person1.equals(person2)) {
			System.out.println("似てる人");
		} else {
			System.out.println("違う人");
		}

	}

}