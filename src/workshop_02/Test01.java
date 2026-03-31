package workshop_02;

public class Test01 {

	public static void main(String[] args) {

		String s1 = "1";
		String s2 = "2";
		boolean bnx = false;
		char c1 = 'A';
		char c2 = 'B';
		char c3 = '1';
		char c4 = '2';
		int inx = 2;
		
		// 내 답안
		System.out.println(s1+s2);
		System.out.println(!bnx);
		System.out.println(c1+c2);
		System.out.println(c2-(c1-c4));
		System.out.println(c4+c3);
	
		System.out.println("====================");
		// 강사님 답안
		System.out.println("1" + "2");
		System.out.println(!bnx);
		System.out.println('A' + 'B');
		System.out.println('1' + 2);
		System.out.println('1' + '2');
	
		
	}

}
