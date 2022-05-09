package online_bookstore;

public class BookDTO {
	private Long b_id;
	private String bookTitle;
	private String bookPublisher;
	private int bookPrice;
	
	public BookDTO() {
		
	}

	public BookDTO(Long b_id, String bookTitle, String bookPublisher, int bookPrice) {
		super();
		this.b_id = b_id;
		this.bookTitle = bookTitle;
		this.bookPublisher = bookPublisher;
		this.bookPrice = bookPrice;
	}

	public Long getB_id() {
		return b_id;
	}

	public void setB_id(Long b_id) {
		this.b_id = b_id;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookPublisher() {
		return bookPublisher;
	}

	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

	@Override
	public String toString() {
		return "BookDTO [b_id=" + b_id + ", bookTitle=" + bookTitle + ", bookPublisher=" + bookPublisher
				+ ", bookPrice=" + bookPrice + "]";
	}

	
	
}
