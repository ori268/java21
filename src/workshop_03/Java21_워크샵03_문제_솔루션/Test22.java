package workshop_03.Java21_워크샵03_문제_솔루션;

public class Test22 {
	public static void main(String[] args) {

		for (char i = 'A'; i <= 'E'; i++) {
			for (char j = 'A'; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
