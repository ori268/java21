package workshop_02;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {

		// Scanner 이용하여 갑을 입력 받는 코드 구현
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("주소를 입력하시오.");
		String address1 = scan.next();   // 키보드를 쓸때 띄워쓰면 자동으로 하나씩 입력됨. 
		String address2 = scan.next();
		String address3 = scan.next();
		System.out.printf("도명: %s \n시명: %s \n구명: %s \n", address1, address2, address3);
		// printf 는 마지막에 변수를 한 번에 작성하면 됨.
		
		scan.close();
	}

}
