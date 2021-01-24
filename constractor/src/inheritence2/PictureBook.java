package inheritence2;

public class PictureBook extends Book {
	
	public String pictureQuality;
	
	public PictureBook(String title, int page, String author, String pictureQuality) {

		super(title, page, author);
		this.pictureQuality = pictureQuality;
	}

}
