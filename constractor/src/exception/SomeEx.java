package exception;

import java.util.Arrays;
import java.util.List;

public class SomeEx {

	public static void throwNullPointer() throws NullPointerException {

		List<String> list = Arrays.asList("A", "B", "C", null, "D");

		for (String str : list) {
			System.out.println(str.length());
		}
	}

	public static int throwIndexOutOfBounds() throws IndexOutOfBoundsException {

		List<Integer> numList = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> evenNumList = Arrays.asList(2, 4, 6, 8, 10);
		int count = 0;

		for (int index = 0; index < numList.size(); index++) {

			if (numList.get(index) == evenNumList.get(index)) {
				count++;
			}
		}
		return count;
	}

	public static void throwNumberFormat() throws NumberFormatException {

		byte num = 34;
		char c = (char) num;
		System.out.println(num);

		String str = String.valueOf(c);
		System.out.println(str);
		int number = Integer.parseInt(str);
	}
}
