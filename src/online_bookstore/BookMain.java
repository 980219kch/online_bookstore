package online_bookstore;

import java.util.*;

public class BookMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BookService bs = new BookService();
		int selectNumber = 0;
		boolean run = true;
		while(run) {
			System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("1.회원가입 | 2.로그인 | 3.책등록 | 4.장바구니담기 | 5.장바구니조회 | 6.포인트충전 | 7.포인트출금 | 8.남은포인트조회 | 9.장바구니구매 | 10.책구매내역조회");
			System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
			System.out.print("선택> ");
			selectNumber = scan.nextInt();
			if(selectNumber == 1) {
				bs.save();
			} else if(selectNumber == 2) {
				bs.login();
			} else if(selectNumber == 3) {
				bs.book();
			} else if(selectNumber == 4) {
				bs.cart();
			} else if(selectNumber == 5) {
				bs.showCart();
			} else if(selectNumber == 6) {
				bs.deposit();
			} else if(selectNumber == 7) {
				bs.withdraw();
			} else if(selectNumber == 8) {
				bs.balance();
			} else if(selectNumber == 9) {
				bs.buyCart();
			} else if(selectNumber == 10) {
				bs.buyingList();
			}
		}


	}

}
