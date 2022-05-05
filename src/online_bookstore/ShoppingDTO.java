package online_bookstore;

public class ShoppingDTO {
	private Long id;
	private String bookTitle;
	private String bookPublisher;
	private String bookAuthor;
	private int bookPrice;
	
	public ShoppingDTO() {
		
	}

	public ShoppingDTO(Long id, String bookTitle, String bookPublisher, String bookAuthor, int bookPrice) {
		super();
		this.id = id;
		this.bookTitle = bookTitle;
		this.bookPublisher = bookPublisher;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

	@Override
	public String toString() {
		return "ShoppingDTO [id=" + id + ", bookTitle=" + bookTitle + ", bookPublisher=" + bookPublisher
				+ ", bookAuthor=" + bookAuthor + ", bookPrice=" + bookPrice + "]";
	}
	
	
}
