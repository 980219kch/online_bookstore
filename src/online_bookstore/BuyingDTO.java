package online_bookstore;

public class BuyingDTO {
	private Long id;
	private String memberId;
	private String bookTitle;
	
	public BuyingDTO() {
		
	}

	public BuyingDTO(Long id, String memberId, String bookTitle) {
		super();
		this.id = id;
		this.memberId = memberId;
		this.bookTitle = bookTitle;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "BuyingDTO [id=" + id + ", memberId=" + memberId + ", bookTitle=" + bookTitle + "]";
	}

	
}
