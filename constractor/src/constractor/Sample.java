package constractor;

public class Sample {

	public static void main(String[] args) {

		DateCalc cs1;

		if (args.length == 0) {
			cs1 = new DateCalc();
		} else {
			try {
				cs1 = new DateCalc(Integer.parseInt(args[0]));
			} catch (NumberFormatException e) {
				cs1 = new DateCalc(args[0]);
			}
		}

		cs1.printDate();
	}

}
