package online_bookstore;

import java.util.*;


public class BookRepository {
	static List<MemberDTO> memberList = new ArrayList<>();
	static List<BookDTO> bookList = new ArrayList<>();
	static List<CartDTO> cartList = new ArrayList<>();
	static List<BuyingDTO> buyingList = new ArrayList<>();
	static Long bankingId = 0L;
	static Long id = 0L;
	public boolean checkId(String memberId) {
		boolean checkResult = false;
		for(int i = 0; i < memberList.size(); i++) {
			if(memberId.equals(memberList.get(i).getMemberId())) {
				checkResult = true;
			}
		}
		return checkResult;
	}

	public boolean save(MemberDTO member) {
		return memberList.add(member);
	}

	public boolean login(String memberId, String memberPass) {
		boolean result = false;
		for(int i = 0; i < memberList.size(); i++) {
			if(memberId.equals(memberList.get(i).getMemberId()) && memberPass.equals(memberList.get(i).getMemberPass())) {
				result = true;
			}
		}
		return result;
	}

	public boolean book(BookDTO book) {
		return bookList.add(book);
	}

	public void cart(CartDTO cart) {
		cartList.add(cart);
		
	}

	public List<CartDTO> cartList(String memberId) {
		List<CartDTO> list = new ArrayList<CartDTO>();
		for(int i = 0; i < cartList.size(); i++) {
			if(memberId.equals(cartList.get(i).getMemberId())) {
				list.add(cartList.get(i));
			}
		}
		return list;
	}

	public boolean checkAccount(String accountNumber) {
		boolean result = false;
		for(int i = 0; i < memberList.size(); i++) {
			if(accountNumber.equals(memberList.get(i).getAccountNumber())) {
				result = true;
			}
		}
		return result;
	}

	public void deposit(String accountNumber, int money) {
		for(int i = 0; i < memberList.size(); i++) {
			if(accountNumber.equals(memberList.get(i).getAccountNumber())) {
				memberList.get(i).setBalance(memberList.get(i).getBalance() + money);
			}
		}
		
	}

	public boolean withdraw(String accountNumber, int money) {
		boolean result = false;
		for(int i = 0; i < memberList.size(); i++) {
			if(accountNumber.equals(memberList.get(i).getAccountNumber())) {
				if(memberList.get(i).getBalance() >= money ) {
					memberList.get(i).setBalance(memberList.get(i).getBalance() - money);
					result = true;
				}
				
			} 	
		}
		return result;
	}

	public MemberDTO checkBalance(String accountNumber) {
		MemberDTO member = null;
		for(int i = 0; i < memberList.size(); i++) {
			if(accountNumber.equals(memberList.get(i).getAccountNumber())) {
				member = memberList.get(i);
			}
		}
		return member;
	}

	public boolean buyCart(String memberId) {
		boolean result = false;
		for(int j = 0; j < memberList.size(); j++) { 
			for(int k = cartList.size() - 1; k >= 0; k--) {
				if(memberId.equals(memberList.get(j).getMemberId()) && memberId.equals(cartList.get(k).getMemberId())) {
						if(memberList.get(j).getBalance() >= cartList.get(k).getBookPrice()) {
							memberList.get(j).setBalance(memberList.get(j).getBalance() - cartList.get(k).getBookPrice());
							BuyingDTO buying = new BuyingDTO(++id, memberId, cartList.get(k).getBookTitle());
							buyingList.add(buying);
							cartList.remove(k);
							result = true;
						} else {
							result = false;
						}
				}
				
			}
			
		}
		return result;
	}

	public List<BuyingDTO> buyingList(String memberId) {
		List<BuyingDTO> list = new ArrayList<BuyingDTO>();
		for(int i = 0; i < buyingList.size(); i++) {
			if(memberId.equals(buyingList.get(i).getMemberId())) {
				list.add(buyingList.get(i));
			}
		}
		return list;
	}

	

	

	
}
