package online_bookstore;

import java.util.*;

public class ShoppingService {
	Scanner scan = new Scanner(System.in);
	static Long id = 0L;
	public void save() {
		System.out.println("아이디: ");
		String memberId = scan.next();
		System.out.println("비밀번호: ");
		String memberPass = scan.next();
		System.out.println("이름: ");
		String memberName = scan.next();
		System.out.println("이메일: ");
		String memberEmail = scan.next();
		System.out.println("주소: ");
		String memberAddress = scan.next();
		System.out.println("전화번호: ");
		String memberMobile = scan.next();
		
		MemberDTO member = new MemberDTO(++id, memberId, memberPass, memberName, memberEmail, memberAddress, memberMobile);
		
	}

}
