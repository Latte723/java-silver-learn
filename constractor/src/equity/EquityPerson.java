package equity;

import java.time.LocalDate;

public class EquityPerson {

	private String name;
	private LocalDate birthdate;
	private int height;
	private double weight;

	public EquityPerson(String name, LocalDate birthdate, int height, double weight) {

		this.name = name;
		this.birthdate = birthdate;
		this.height = height;
		this.weight = weight;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj == null) {
			return false;
		}
		if (obj instanceof EquityPerson) {
			EquityPerson ep = (EquityPerson) obj;
			if (ep.name.equals(name) && ep.birthdate.equals(birthdate) && ep.height == height && ep.weight == weight) {
				return true;
			}
		}
		return false;
	}
}
