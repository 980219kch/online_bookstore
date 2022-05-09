package online_bookstore;

public class CartDTO {
	private String memberId;
	private String bookTitle;
	private String bookPublisher;
	private int bookPrice;
	
	public CartDTO() {
		
	}

	public CartDTO(String memberId, String bookTitle, String bookPublisher, int bookPrice) {
		super();
		this.memberId = memberId;
		this.bookTitle = bookTitle;
		this.bookPublisher = bookPublisher;
		this.bookPrice = bookPrice;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
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
		return "CartDTO [memberId=" + memberId + ", bookTitle=" + bookTitle + ", bookPublisher=" + bookPublisher
				+ ", bookPrice=" + bookPrice + "]";
	}
		
	
}
