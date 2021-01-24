package inheritence2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Book> bookShelf = new ArrayList<>();
		bookShelf.add(new Novel("伝記", 1000, "昔の人"));
		bookShelf.add(new PictureBook("絵本", 20, "絵本作家", "子供向け"));
		bookShelf.add(new Comic("漫画", 200, "漫画家", "青少年向け"));

		System.out.println(extractQuality(bookShelf));
	}

	private static List<String> extractQuality(List<Book> bookShelf) {

		List<String> qualityList = new ArrayList<>();

		for (Book book : bookShelf) {
			if (book instanceof PictureBook) {
				qualityList.add(((PictureBook) book).pictureQuality);
			}
		}
		return qualityList;
	}

}
