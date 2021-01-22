package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayGacha {

	private static final String[] FREE_ITEMS = { "A", "B", "C", "D" };
	private static final String[] PAY_ITEMS = { "S", "A", "B", "C" };
	private List<String> items;
	private List<String> gainedItems = new ArrayList<>();

	public ArrayGacha() {
		items = Arrays.asList(FREE_ITEMS);
	}

	public ArrayGacha(boolean paidFlg) {
		items = Arrays.asList(paidFlg ? PAY_ITEMS : FREE_ITEMS);
	}

	public ArrayGacha(String... items) {
		this.items = Arrays.asList(items);
	}

	public String takeOne() {

		List<String> tempItems = new ArrayList<>();

		for (String item : items) {
			for (int i = 0; i <= gainedItems.size(); i++) {
				tempItems.add(item);
			}
		}

		/*
		for (int i = 0; i <= gainedItems.size(); i++) {
			tempItems.addAll(items);
		}
		*/

		for (String sameItem : gainedItems) {
			int index = tempItems.indexOf(sameItem);
			if (index > -1) {
				tempItems.remove(index);
			}
		}

		int index = (int) (Math.random() * tempItems.size());
		String item = tempItems.get(index);
		gainedItems.add(item);
		return item;
	}
}
