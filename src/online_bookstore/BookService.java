package online_bookstore;

import java.util.*;

public class BookService {
	Scanner scan = new Scanner(System.in);
	BookRepository br = new BookRepository();
	static Long id = 0L;
	static Long b_id = 0L;
	public void save() {
		System.out.print("아이디: ");
		String memberId = scan.next();
		System.out.print("비밀번호: ");
		String memberPass = scan.next();
		System.out.print("이름: ");
		String memberName = scan.next();
		System.out.print("주소: ");
		String memberAddress = scan.next();
		System.out.print("전화번호: ");
		String memberMobile = scan.next();
		System.out.print("충전계좌: ");
		String accountNumber = scan.next();
		boolean checkId = br.checkId(memberId);
		if(checkId) {
			System.out.println("중복된 아이디입니다. 다시 입력해주세요");
		} else {
			MemberDTO member = new MemberDTO(++id, memberId, memberPass, memberName, memberAddress, memberMobile, 0, accountNumber);
			boolean saveResult = br.save(member);
			if(saveResult) {
				System.out.println("회원가입이 완료되었습니다.");
				System.out.println(member);
			} else {
				System.out.println("회원가입이 실패하였습니다.");
			}
		}
	}
	
	public void login() {
		System.out.print("아이디: ");
		String memberId = scan.next();
		System.out.print("비밀번호: ");
		String memberPass = scan.next();
		if(br.login(memberId, memberPass)) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
	}

	public void book() {
		System.out.print("책제목: ");
		String bookTitle = scan.next();
		System.out.print("출판사: ");
		String bookPublisher = scan.next();
		System.out.print("가격: ");
		int bookPrice = scan.nextInt();
		BookDTO book = new BookDTO(++b_id, bookTitle, bookPublisher, bookPrice);
		if(br.book(book)) {
			System.out.println("책이 등록되었습니다.");
			System.out.println(book);
		} else {
			System.out.println("책등록이 실패하였습니다.");
		}
	}

	public void cart() {
		System.out.print("아이디: ");
		String memberId = scan.next();
		System.out.print("비밀번호: ");
		String memberPass = scan.next();
		if(br.login(memberId, memberPass)) {
			System.out.print("책제목: ");
			String bookTitle = scan.next();
			System.out.print("출판사: ");
			String bookPublisher = scan.next();
			System.out.print("가격: ");
			int bookPrice = scan.nextInt();
			CartDTO cart = new CartDTO(memberId, bookTitle, bookPublisher, bookPrice);
			
			br.cart(cart);
			System.out.println(cart);
		} else {
			System.out.println("아이디 또는 비밀번호가 틀립니다.");
		}
		 
	}

	public void showCart() {
		System.out.print("아이디: ");
		String memberId = scan.next();
		System.out.print("비밀번호: ");
		String memberPass = scan.next();
		if(br.login(memberId, memberPass)) {
			List<CartDTO> cartList = br.cartList(memberId);
			System.out.println("-------------------------------장바구니 내역-------------------------------");
			for(CartDTO c: cartList) {
				System.out.println(c);
			}
		} else {
			System.out.println("아이디 또는 비밀번호가 틀립니다.");
		}
	}

	public void deposit() {
		System.out.print("아이디: ");
		String memberId = scan.next();
		System.out.print("비밀번호: ");
		String memberPass = scan.next();
		if(br.login(memberId, memberPass)) {
			System.out.print("계좌번호: ");
			String accountNumber = scan.next();
			System.out.print("충전금액: ");
			int money = scan.nextInt();
			if(br.checkAccount(accountNumber)) {
				br.deposit(accountNumber, money);
			} else {
				System.out.println("일치하는 계좌가 없습니다.");
			}
		} else {
			System.out.println("아이디 또는 비밀번호가 틀립니다.");
		}
		
		
	}

	public void withdraw() {
		System.out.print("아이디: ");
		String memberId = scan.next();
		System.out.print("비밀번호: ");
		String memberPass = scan.next();
		if(br.login(memberId, memberPass)) {
			System.out.print("계좌번호: ");
			String accountNumber = scan.next();
			System.out.print("출금금액: ");
			int money = scan.nextInt();
			if(br.checkAccount(accountNumber)) {
				if(br.withdraw(accountNumber, money)) {
					System.out.println("출금처리 완료");
				} else {
					System.out.println("잔액이 부족합니다.");
				}
			} else {
				System.out.println("일치하는 계좌가 없습니다.");
			}
		} else {
			System.out.println("아이디 또는 비밀번호가 틀립니다.");
		}
		
	}

	public void balance() {
		System.out.print("아이디: ");
		String memberId = scan.next();
		System.out.print("비밀번호: ");
		String memberPass = scan.next();
		if(br.login(memberId, memberPass)) {
			System.out.print("계좌번호: ");
			String accountNumber = scan.next();
			if(br.checkAccount(accountNumber)) {
				MemberDTO member = br.checkBalance(accountNumber);
				System.out.println(memberId + "님 계좌의 잔액은 " + member.getBalance() + "원 입니다.");
			}
		}
	}

	public void buyCart() {
		System.out.print("아이디: ");
		String memberId = scan.next();
		System.out.print("비밀번호: ");
		String memberPass = scan.next();
		if(br.login(memberId, memberPass)) {
			if(br.buyCart(memberId)) {
				System.out.println("책을 구매하였습니다.");
			} else {
				System.out.println("실패하였습니다");
			}
		} else {
			System.out.println("아이디 또는 비밀번호가 틀립니다.");
		}
		
	}

	public void buyingList() {
		System.out.print("아이디: ");
		String memberId = scan.next();
		System.out.print("비밀번호: ");
		String memberPass = scan.next();
		if(br.login(memberId, memberPass)) {
			List<BuyingDTO> buyingList = br.buyingList(memberId);
			for(BuyingDTO b: buyingList) {
				System.out.println(b);
			}
		} else {
			System.out.println("아이디 또는 비밀번호가 틀립니다.");
		}
		
	}




}
