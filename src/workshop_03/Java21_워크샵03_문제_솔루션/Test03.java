package workshop_03.Java21_워크샵03_문제_솔루션;

public class Test03 {
	public static void main(String[] args) {
		int i = 0;
		while (i <= 10) {
			int j = 0;
			while (j <= i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
