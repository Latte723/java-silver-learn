package array;

import java.util.Arrays;

public class ArrayMain {

	public static void main(String[] args) {

		int price;
		ArrayGacha arrayGacha;

		try {
			price = Integer.parseInt(args[0]);
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			price = 0;
		}

		if (price == 0) {
			arrayGacha = new ArrayGacha();
		} else if (args.length > 1 && price >= 1000) {
			arrayGacha = new ArrayGacha(Arrays.copyOfRange(args, 1, args.length));
		} else {
			arrayGacha = new ArrayGacha(true);
		}

		System.out.println(arrayGacha.takeOne());
	}

}
