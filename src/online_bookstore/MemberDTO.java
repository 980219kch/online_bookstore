package online_bookstore;

public class MemberDTO {
	private Long id;
	private String memberId;
	private String memberPass;
	private String memberName;
	private String memberEmail;
	private String memberAddress;
	private String memberMobile;
	
	public MemberDTO() {
		
	}

	public MemberDTO(Long id, String memberId, String memberPass, String memberName, String memberEmail,
			String memberAddress, String memberMobile) {
		super();
		this.id = id;
		this.memberId = memberId;
		this.memberPass = memberPass;
		this.memberName = memberName;
		this.memberEmail = memberEmail;
		this.memberAddress = memberAddress;
		this.memberMobile = memberMobile;
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

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
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

	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", memberId=" + memberId + ", memberPass=" + memberPass + ", memberName="
				+ memberName + ", memberEmail=" + memberEmail + ", memberAddress=" + memberAddress + ", memberMobile="
				+ memberMobile + "]";
	}
	
	
}	