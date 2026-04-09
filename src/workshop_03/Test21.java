package workshop_03;

public class Test21 {

	public static void main(String[] args) {
		/*
		 * 내 답 for (int i = 1; i <= 100; i++) { System.out.printf("%d ", i); if (i % 10
		 * == 0) { System.out.println(); } }
		 */
		for (int i = 1; i <= 100; i++) {
			if (i < 10)
				System.out.print(" ");

			System.out.print(i + " ");

			if (i % 10 == 0) {
				System.out.println();
			}
		}

	}

}
