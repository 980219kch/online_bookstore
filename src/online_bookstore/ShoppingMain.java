package online_bookstore;

import java.util.*;

public class ShoppingMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ShoppingService ss = new ShoppingService();
		int selectNumber = 0;
		boolean run = true;
		while(run) {
			System.out.println("------------------------------------");
			System.out.println("1.회원가입 | 2.로그인 | 3.");
			System.out.println("------------------------------------");
			System.out.println("선택> ");
			selectNumber = scan.nextInt();
			if(selectNumber == 1) {
				ss.save();
			}
		}

	}

}
