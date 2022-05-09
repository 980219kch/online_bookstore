package online_bookstore;

public class MemberDTO {
	private Long id;
	private String memberId;
	private String memberPass;
	private String memberName;
	private String memberAddress;
	private String memberMobile;
	private long balance;
	private String accountNumber;
	
	public MemberDTO() {
		
	}

	public MemberDTO(Long id, String memberId, String memberPass, String memberName, String memberAddress,
			String memberMobile, long balance, String accountNumber) {
		this.id = id;
		this.memberId = memberId;
		this.memberPass = memberPass;
		this.memberName = memberName;
		this.memberAddress = memberAddress;
		this.memberMobile = memberMobile;
		this.balance = balance;
		this.accountNumber = accountNumber;
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

	public String getMemberPass() {
		return memberPass;
	}

	public void setMemberPass(String memberPass) {
		this.memberPass = memberPass;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberAddress() {
		return memberAddress;
	}

	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}

	public String getMemberMobile() {
		return memberMobile;
	}

	public void setMemberMobile(String memberMobile) {
		this.memberMobile = memberMobile;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", memberId=" + memberId + ", memberPass=" + memberPass + ", memberName="
				+ memberName + ", memberAddress=" + memberAddress + ", memberMobile=" + memberMobile + ", balance="
				+ balance + ", accountNumber=" + accountNumber + "]";
	}

	
	
}	